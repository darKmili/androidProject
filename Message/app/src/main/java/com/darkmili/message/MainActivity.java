package com.darkmili.message;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.darkmili.message.adapter.MsgAdapter;
import com.darkmili.message.entity.Msg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Runnable{
    private  List<Msg> msgList=new ArrayList<>();
    private EditText editText;
    private Button send;
    private RecyclerView recyclerView;
    private MsgAdapter msgAdapter;
    private static final String HOST = "127.0.0.1";
    private static final int PORT = 12345;
    private Socket socket = null;
    private BufferedReader in = null;
    private PrintWriter out = null;
    private String content = "";
    private StringBuilder sb = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //当程序一开始运行的时候就实例化Socket对象,与服务端进行连接,获取输入输出流
        //因为4.0以后不能再主线程中进行网络操作,所以需要另外开辟一个线程
        new Thread() {

            public void run() {
                try {
                    socket = new Socket(HOST, PORT);
                    in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                    out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
                            socket.getOutputStream())), true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();


        editText=findViewById(R.id.bottom_edit);
        send=findViewById(R.id.bottom_button_send);
        recyclerView=findViewById(R.id.recyc);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        msgAdapter=new MsgAdapter(msgList);
        recyclerView.setAdapter(msgAdapter);

        send.setOnClickListener(new View.OnClickListener() {
            Msg msg;
            @Override
            public void onClick(View view) {
                final String output=editText.getText().toString();
                new Thread(){
                    @Override
                    public void run() {
                        if (socket.isConnected()) {
                            if (!socket.isOutputShutdown()) {
                                out.println(output);
                            }
                        }
                    }
                }.start();


                if(!"".equals(output)){
                    msg=new Msg(output,Msg.TYPE_SEND);
                    msgList.add(msg);
                    msgAdapter.notifyItemInserted(msgList.size()-1);
                    recyclerView.scrollToPosition(msgList.size()-1);
                    editText.setText("");
                }
            }
        });
        new Thread(MainActivity.this).start();
    }



    @Override
    public void run() {
        try {
            while (true) {
                if (socket.isConnected()) {
                    if (!socket.isInputShutdown()) {
                        if ((content = in.readLine()) != null) {
                            content += "\n";
                        }
                    }
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Msg msg = new Msg(content.toString(), Msg.TYPE_RECEIVED);
                            msgList.add(msg);
                            msgAdapter.notifyItemInserted(msgList.size()-1);
                            recyclerView.scrollToPosition(msgList.size()-1);
                        }
                    });
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

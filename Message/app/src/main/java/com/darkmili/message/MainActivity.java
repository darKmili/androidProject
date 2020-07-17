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

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private  List<Msg> msgList=new ArrayList<>();
    private EditText editText;
    private Button send;
    private RecyclerView recyclerView;
    private MsgAdapter msgAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMsg();
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
                String input=editText.getText().toString();
                if(!"".equals(input)){
                    msg=new Msg(input,Msg.TYPE_SEND);
                    msgList.add(msg);
                    msgAdapter.notifyItemInserted(msgList.size()-1);
                    recyclerView.scrollToPosition(msgList.size()-1);
                    editText.setText("");
                }
            }
        });

    }

    public void  initMsg(){
        msgList.add(new Msg("你好，同学",Msg.TYPE_RECEIVED));
        msgList.add(new Msg("你好，有啥事",Msg.TYPE_SEND));
        msgList.add(new Msg("没事，同学",Msg.TYPE_RECEIVED));
        msgList.add(new Msg("真的没事嘛，同学",Msg.TYPE_SEND));
        msgList.add(new Msg("真的没事，同学",Msg.TYPE_RECEIVED));
        msgList.add(new Msg("那好吧，保重，同学",Msg.TYPE_SEND));
    }
}

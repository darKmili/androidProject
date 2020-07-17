package com.darkmili.message.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import android.widget.RelativeLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.darkmili.message.R;
import com.darkmili.message.entity.Msg;

import java.util.List;

public class MsgAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Msg> msgList;

    public MsgAdapter(List<Msg> msgList) {
        this.msgList = msgList;
    }

    public void setMsgList(List<Msg> msgList) {
        this.msgList = msgList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout linearLayout_left;
        RelativeLayout relativeLayout;
        TextView textView_left;
        TextView textView_right;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_left = (TextView) itemView.findViewById(R.id.left_text);
            textView_right = (TextView) itemView.findViewById(R.id.right_text);
            linearLayout_left = itemView.findViewById(R.id.msg_left_lay);
            relativeLayout = itemView.findViewById(R.id.msg_right_lay);
        }

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.msg_item, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewholder, int position) {
        Msg msg = msgList.get(position);
        ViewHolder holder=(ViewHolder) viewholder;
        switch (msg.getType()) {
            case Msg.TYPE_RECEIVED:
                holder.linearLayout_left.setVisibility(View.VISIBLE);
                holder.relativeLayout.setVisibility(View.GONE);
                holder.textView_left.setText(msg.getContent());
                break;
            case Msg.TYPE_SEND:
                holder.linearLayout_left.setVisibility(View.GONE);
                holder.relativeLayout.setVisibility(View.VISIBLE);
                holder.textView_right.setText(msg.getContent());
                break;
            default:

        }
    }

    @Override
    public int getItemCount() {
        return msgList.size();
    }
}

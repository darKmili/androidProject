package com.darkmili.sharedpreferencetest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.FriendHolder> {
       private List<Friend> friendList=null;

    class FriendHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public ImageView getImageView() {
            return imageView;
        }

        public void setImageView(ImageView imageView) {
            this.imageView = imageView;
        }

        public TextView getTextView() {
            return textView;
        }

        public void setTextView(TextView textView) {
            this.textView = textView;
        }

        public FriendHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.list_item_image);
            textView=itemView.findViewById(R.id.list_item_text);
        }
    }

    public FriendAdapter(List<Friend> friendList) {
        this.friendList = friendList;
    }



    @NonNull
    @Override
    public FriendHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        FriendHolder holder = new FriendHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull FriendHolder holder, int position) {
        Friend friend = friendList.get(position);
        holder.getImageView().setImageResource(friend.getImage_id());
        holder.getTextView().setText(friend.getUsername());

    }



    @Override
    public int getItemCount() {
        return friendList.size();
    }
}

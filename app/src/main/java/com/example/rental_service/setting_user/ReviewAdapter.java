package com.example.rental_service.setting_user;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.rental_service.R;

import java.util.ArrayList;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.CustomViewHolder>{
    private ArrayList<ReviewData> arrayList;

    public ReviewAdapter(ArrayList<ReviewData> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.setting_review_list,parent,false);
        CustomViewHolder holder =new CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.review_date.setText(arrayList.get(position).getDate());
        holder.review_comment.setText(arrayList.get(position).getComment());
        holder.review_rate.setText(arrayList.get(position).getRate());
        holder.index_of_review_DB=arrayList.get(position).getIndex_of_review_DB();

        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return (arrayList!=null ? arrayList.size():0);
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder{
        protected TextView review_date;
        protected TextView review_comment;
        protected TextView review_rate;
        protected int index_of_review_DB;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.review_date=itemView.findViewById(R.id.text_review_date);
            this.review_comment=itemView.findViewById(R.id.text_review_comment);
            this.review_rate=itemView.findViewById(R.id.text_review_rate);
        }
    }
}

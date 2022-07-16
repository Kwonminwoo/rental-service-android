package com.example.rental_service.setting_user;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;


import androidx.recyclerview.widget.RecyclerView;

import com.example.rental_service.R;

import java.util.ArrayList;

public class BsAdapter extends  RecyclerView.Adapter<BsAdapter.CustomViewHolder> {
    private ArrayList<BsData> arrayList;

    public BsAdapter(ArrayList<BsData> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public BsAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.setting_bs_list,parent,false);
        BsAdapter.CustomViewHolder holder =new BsAdapter.CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BsAdapter.CustomViewHolder holder, int position) {//추가 될 때 동작
        holder.BS_name.setText(arrayList.get(position).getName_of_item());
        holder.BS_start_date.setText(arrayList.get(position).getDate_start());
        holder.Bs_deadline_date.setText(arrayList.get(position).getDate_to_deadline());
        holder.BS_index_of_contract_on_DB=arrayList.get(position).getIndex_of_contract_on_DB();

        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //DB 인덱스 기반으로 거래했던 창이나 상대 유저와 채팅방으로 이동?
            }
        });
    }

    @Override
    public int getItemCount() {
        return (arrayList!=null ? arrayList.size():0);
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder{
        protected TextView BS_name;
        protected TextView BS_start_date;
        protected TextView Bs_deadline_date;
        protected int BS_index_of_contract_on_DB;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.BS_name=itemView.findViewById(R.id.text_bs_name);
            this.BS_start_date=itemView.findViewById(R.id.text_bs_start_date);
            this.Bs_deadline_date=itemView.findViewById(R.id.text_bs_deadline_date);
        }
    }
}

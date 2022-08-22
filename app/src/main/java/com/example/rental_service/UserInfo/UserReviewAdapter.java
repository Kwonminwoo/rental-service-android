package com.example.rental_service.UserInfo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rental_service.R;

import java.util.ArrayList;


public class UserReviewAdapter extends RecyclerView.Adapter<UserReviewAdapter.ViewHolder> {
    ArrayList<UserReview> items =new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.user_review,viewGroup,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        UserReview review = items.get(position);
        viewHolder.setItem(review);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public ViewHolder(View itemVIew){
            super(itemVIew);

            textView= itemVIew.findViewById(R.id.user_review);

        }

        public void setItem(UserReview item){
            textView.setText(item.getUser_Review());
        }
    }
    public void addItem(UserReview item){
        items.add(item);
    }
    public void setItems(ArrayList<UserReview>items){
        this.items = items;
    }
    public UserReview getItem(int position){
        return items.get(position);
    }
    public void setItem(int position,UserReview item){
        items.set(position,item);
    }
}

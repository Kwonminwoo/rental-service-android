package com.example.rental_service.Home;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rental_service.PlacePostActivity;
import com.example.rental_service.R;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private List<Item> items = new ArrayList<>();
    private Context context;

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        context = parent.getContext();

        View itemView = inflater.inflate(R.layout.home_fragment_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = items.get(position);
        holder.setItem(item);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "asdsadsadsad", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, PlacePostActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Item item){
        Log.e("add", this + "");
        this.items.add(item);
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

    public Item getItem(int position){
        return items.get(position);
    }

    public void setItem(int position, Item item){
        items.set(position, item);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mainImage;
        TextView itemName;
        TextView userName;
        TextView date;
        TextView title;

        public ViewHolder(View view) {
            super(view);

            mainImage = view.findViewById(R.id.mainImageView);
            itemName = view.findViewById(R.id.recyclerStuffName);
            userName = view.findViewById(R.id.recyclerUserName);
            date = view.findViewById(R.id.recyclerPostDate);
            title = view.findViewById(R.id.recyclerTitle);
        }

        public void setItem(Item item){
            mainImage.setImageResource(item.getMainImage());
            itemName.setText(item.getName());
            userName.setText(item.getUserName());
            date.setText(item.getDate());
            title.setText(item.getTitle());
        }
    }
}

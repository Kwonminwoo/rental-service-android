package com.example.rental_service.upload;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rental_service.R;

import java.util.ArrayList;
import java.util.List;

public class MyItemAdapter extends RecyclerView.Adapter<MyItemAdapter.ViewHolder> {
    private List<MyItem> items = new ArrayList<>();
    private Context context;

    @NonNull
    @Override
    public MyItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        context = parent.getContext();

        View itemView = inflater.inflate(R.layout.my_item_view, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MyItem item = items.get(position);
        holder.setItem(item);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "클릭", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(MyItem item){
        this.items.add(item);
    }

    public void setItems(ArrayList<MyItem> items){
        this.items = items;
    }

    public MyItem getItem(int position){
        return items.get(position);
    }

    public void setItem(int position, MyItem item){
        items.set(position, item);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title;

        public ViewHolder(View view) {
            super(view);

            image = view.findViewById(R.id.myItemImage);
            title = view.findViewById(R.id.myItemTitle);
        }

        public void setItem(MyItem item){
            image.setImageResource(item.getImage());
            title.setText(item.getTitle());
        }
    }
}

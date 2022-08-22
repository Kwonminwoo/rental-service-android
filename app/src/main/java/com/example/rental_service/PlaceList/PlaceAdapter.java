package com.example.rental_service.PlaceList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rental_service.R;

import java.util.ArrayList;


public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {
    ArrayList<Place> items =new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.place_item,viewGroup,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Place item = items.get(position);
        viewHolder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        TextView textView2;
        TextView textView3;

        public ViewHolder(View itemVIew){
            super(itemVIew);

            textView= itemVIew.findViewById(R.id.user_name);
            textView2= itemVIew.findViewById(R.id.user_region);
            textView3= itemVIew.findViewById(R.id.place_comment);

        }

        public void setItem(Place item){
            textView.setText(item.getName());
            textView2.setText(item.getRegion());
            textView3.setText(item.getComment());
        }
    }
    public void addItem(Place item){
        items.add(item);
    }
    public void setItems(ArrayList<Place>items){
        this.items = items;
    }
    public Place getItem(int position){
        return items.get(position);
    }
    public void setItem(int position,Place item){
        items.set(position,item);
    }
}

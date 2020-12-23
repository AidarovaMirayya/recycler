package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.MyTViewHolder>{
    private Context context;
    private List<Food> foodList;

    public class MyTViewHolder extends RecyclerView.ViewHolder{
        public ImageView photo;
        public TextView title, desc, price;

        public MyTViewHolder(View view) {
            super(view);
            photo = view.findViewById(R.id.photo);
            title = view.findViewById(R.id.title);
            desc = view.findViewById(R.id.desc);
            price = view.findViewById(R.id.price);
        }
    }
    public FoodListAdapter(Context context, List<Food> foodList) {
        this.context = context;
        this.foodList = foodList;
    }
    @Override
    public MyTViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);
        return new MyTViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyTViewHolder holder, int position) {

        Food item = foodList.get(position);

        holder.photo.setImageResource(item.getPhoto());
        holder.title.setText(item.getTitle());
        holder.desc.setText(item.getDesc());
        holder.price.setText(""+item.getPrice());
    }

    @Override
    public int getItemCount() {return foodList.size();}
}

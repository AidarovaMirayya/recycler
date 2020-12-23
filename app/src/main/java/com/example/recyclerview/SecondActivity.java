package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    RecyclerView RecyclerView;
    FoodListAdapter foodListAdapter;
    ArrayList<Food> foodList;
    private RecyclerView.LayoutManager LinearLayoutManager, gridLayoutManager;

    Button btnChange;
    boolean layoutType = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        RecyclerView= findViewById(R.id.RecyclerView);
        btnChange= findViewById(R.id.btnChange);
        foodList = new ArrayList<>();

        foodList.add(new Food(R.drawable.a0000450_main, "pizza1", "Tasty", 1500));
        foodList.add(new Food(R.drawable.a0000450_main, "pizza2", "Tasty", 1200));
        foodList.add(new Food(R.drawable.a0000450_main, "pizza3", "Tasty", 1300));

        foodListAdapter= new FoodListAdapter(this, foodList);

        LinearLayoutManager= new LinearLayoutManager(this);
        gridLayoutManager= new GridLayoutManager(this, 3);
        RecyclerView.setLayoutManager(LinearLayoutManager);

        RecyclerView.setAdapter(foodListAdapter);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutType = !layoutType;

                if (layoutType){
                    RecyclerView.setLayoutManager(gridLayoutManager);
                    foodList.remove(0);
                }else {
                    RecyclerView.setLayoutManager(LinearLayoutManager);
                }
                foodListAdapter.notifyDataSetChanged();
            }

        });

    }
}
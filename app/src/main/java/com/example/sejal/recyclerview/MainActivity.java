package com.example.sejal.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] name = {"Burger", "Icecream", "MoMo", "Pizza", "Seasme Noodles"};
    double[] price = {190, 120, 160, 350, 140};
    int[] icon = {R.drawable.burger, R.drawable.icecream, R.drawable.momo, R.drawable.pizza, R.drawable.seasme_noodles};

    RecyclerView recyclerView;
    RecyclerView.LayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        //manager = new LinearLayoutManager(this);
        manager= new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(manager);

        FoodAdapter adapter = new FoodAdapter(this,getData());
        recyclerView.setAdapter(adapter);
        adapter.setOnFoodClickListener(new OnFoodListener() {
            @Override
            public void onFoodClick(Food food, int position) {
                //Toast.makeText(MainActivity.this, position+"\n"+food.getName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,OpenImageActivity.class);
                //intent.putExtra("Icon",food.getIcon());
                //intent.putExtra("Name",food.getName());
                intent.putExtra("food",food);
                intent.putExtra("position",position);
                startActivity(intent);

            }
        });
    }

    public ArrayList<Food> getData() {
        ArrayList<Food> foodList = new ArrayList<>();
        for (int i = 0; i < name.length; i++){
            foodList.add(new Food(name[i], price[i], icon[i]));
        }

        return foodList;
    }

}

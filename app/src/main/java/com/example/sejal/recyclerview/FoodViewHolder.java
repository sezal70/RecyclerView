package com.example.sejal.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sejal on 4/30/2017.
 */

public class FoodViewHolder extends RecyclerView.ViewHolder{

    TextView txtName;
    TextView txtPrice;
    ImageView imgIcon;
    public FoodViewHolder(View itemView) {
        super(itemView);

        txtName=(TextView)itemView.findViewById(R.id.txtName);
        txtPrice=(TextView)itemView.findViewById(R.id.txtPrice);
        imgIcon=(ImageView)itemView.findViewById(R.id.imgIcon);



    }
}

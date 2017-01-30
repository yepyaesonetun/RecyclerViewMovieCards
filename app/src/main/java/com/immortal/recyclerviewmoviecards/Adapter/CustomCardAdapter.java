package com.immortal.recyclerviewmoviecards.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.immortal.recyclerviewmoviecards.Movie;
import com.immortal.recyclerviewmoviecards.R;

import java.util.ArrayList;

/**
 * Created by ACER on 25/10/2016.
 */

public class CustomCardAdapter extends RecyclerView.Adapter<CustomCardAdapter.ViewHolder> {

    private ArrayList<Movie> arrayList;
    private Context context;


    public CustomCardAdapter(ArrayList<Movie> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }





    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_recycler_view_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(arrayList.get(position).getName());
        holder.imageView.setImageResource(arrayList.get(position).getThumbinal());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        private ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);

            textView = (TextView)itemView.findViewById(R.id.tv_movie);
            imageView = (ImageView)itemView.findViewById(R.id.img_thumbnail);
        }



    }
}

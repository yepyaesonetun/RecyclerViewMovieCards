package com.immortal.recyclerviewmoviecards.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.immortal.recyclerviewmoviecards.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ACER on 25/10/2016.
 */

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {

    List<String> Items;

    public SimpleAdapter() {
        super();
        Items = new ArrayList<String>();
        Items.add("Amazing Spiderman 2");
        Items.add("The Guardians of Galaxy");
        Items.add("What If");
        Items.add("Big Hero 6");
        Items.add("The Hunger Game");
        Items.add("X-men: Days of Future Past");
        Items.add("The Lego Movie");
        Items.add("How to Train Your Dragon 2");
        Items.add("Maleficent");
        Items.add("22 Jump Street");
        Items.add("The Maze Runner");
        Items.add("Horrible Bosses 2");
        Items.add("Night at the Museum 3");
    }


    @Override
    public SimpleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.simple_recyclerview_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SimpleAdapter.ViewHolder holder, int position) {
        holder.itemView.setText(Items.get(position));

    }

    @Override
    public int getItemCount() {
        return Items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public TextView itemView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.itemView = (TextView)itemView.findViewById(R.id.tv_recycler_view_item);
        }
    }
}

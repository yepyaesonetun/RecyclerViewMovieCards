package com.immortal.recyclerviewmoviecards;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.immortal.recyclerviewmoviecards.Adapter.CustomCardAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ClickListener{

    RecyclerView recyclerView;
    private final String movieTitle[] = {"Amazing Spiderman 2", "The Guardian of the Galaxy", "Big Hero 6", "The Hunger Game", "What if", "22 Jump Street"};
    private final int movieImage[] = {R.drawable.amazing_spider_man_two, R.drawable.the_guardians_of_the_galaxy, R.drawable.big_hero, R.drawable.the_hunger_game
            , R.drawable.what_if, R.drawable.twenty_two_jump_street};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        
        // TODO - with 2 columns recyclerView ...
        /*
        RecyclerView.LayoutManager gridLayout = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayout);
        */

        //Custom Adapter with CardView ...
        ArrayList<Movie> movieList = prepareData();
        CustomCardAdapter cardAdapter = new CustomCardAdapter(movieList, getApplicationContext());
        recyclerView.setAdapter(cardAdapter);


        //Simple Adapater ...
        /*
        RecyclerView.Adapter simpleAdapter;
        simpleAdapter = new SimpleAdapter();
        recyclerView.setAdapter(simpleAdapter);
        */



        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int i) {
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                        intent.putExtra("ItemPosition", i);

                        startActivity(intent);
                    }
                })
        );





    }

    private ArrayList<Movie> prepareData() {

        ArrayList<Movie> movieList = new ArrayList<>();
        for (int i = 0; i < movieTitle.length; i++) {
            Movie movie = new Movie();
            movie.setName(movieTitle[i]);
            movie.setThumbinal(movieImage[i]);
            movieList.add(movie);
        }
        return movieList;
    }

    @Override
    public void itemClicked(View view, int position) {

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("ItemPosition", position);

        startActivity(intent);
    }
}

package edu.hillel.recyclerdemo;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        RecyclerView rv = (RecyclerView) findViewById(R.id.rvRecycler);

        MyAdapter mAdapter = new MyAdapter(data);
        rv.setAdapter(mAdapter);

        LinearLayoutManager lManager = new LinearLayoutManager(this);
        rv.setLayoutManager(lManager);


//        rv.setLayoutManager(new GridLayoutManager(this, 2));
    }

    private void initData() {
        data.add("one");
        data.add("two");
        data.add("three");
    }
}

package edu.hillel.recyclerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements MyAdapter.OnItemClickListener {

    private ArrayList<String> mData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        RecyclerView rv = (RecyclerView) findViewById(R.id.rvRecycler);

        MyAdapter mAdapter = new MyAdapter(mData, this);
        rv.setAdapter(mAdapter);

        LinearLayoutManager lManager = new LinearLayoutManager(this);
        rv.setLayoutManager(lManager);


//        rv.setLayoutManager(new GridLayoutManager(this, 2));
    }

    private void initData() {
        mData.add("one");
        mData.add("two");
        mData.add("three");
    }

    @Override
    public void onItemClick(int position) {
        Toast.makeText(this, String.valueOf(position), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {

    }
}

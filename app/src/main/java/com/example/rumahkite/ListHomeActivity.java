package com.example.rumahkite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.rumahkite.adapter.ListHomeAdapter;
import com.example.rumahkite.model.Home;

import java.util.ArrayList;

public class ListHomeActivity extends AppCompatActivity {



    private RecyclerView rvHome;
    private ArrayList<Home> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rvHome = findViewById(R.id.rvhome);
        rvHome.setHasFixedSize(true);

        list.addAll(HomeDummy.getListData());
        showRecycler();

    }

    private void showRecycler() {
        rvHome.setLayoutManager(new LinearLayoutManager(this));
        ListHomeAdapter listHomeAdapter = new ListHomeAdapter(list);
        rvHome.setAdapter(listHomeAdapter);

        listHomeAdapter.setOnItemClickCallBack(new ListHomeAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(Home data) {
                Intent intent = new Intent(ListHomeActivity.this, DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_TYPE, data.getType_home());
                intent.putExtra(DetailActivity.EXTRA_PRICE, data.getHarga());
                intent.putExtra(DetailActivity.EXTRA_DESC, data.getDeskripsi());
                intent.putExtra(DetailActivity.EXTRA_PIC, data.getFoto());
                startActivity(intent);
            }
        });
    }

//    private void showSelectedHome(Home home) {
//        Toast.makeText(this, "Kau Menyentuh " + home.getType_home(),Toast.LENGTH_LONG).show();
//    }
}

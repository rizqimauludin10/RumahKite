package com.example.rumahkite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_TYPE = "extra_type";
    public static final String EXTRA_PRICE = "extra_price";
    public static final String EXTRA_DESC = "extra_desc";
    public static final String EXTRA_PIC = "extra_pic";

    TextView getType, getPrice, getDesc;
    ImageView getImg;
    String mType, mPrice, mDesc;
    int mImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getType = findViewById(R.id.get_type);
        getPrice = findViewById(R.id.get_price);
        getDesc = findViewById(R.id.get_desc);
        getImg = findViewById(R.id.img_pic);

        mType = getIntent().getStringExtra(EXTRA_TYPE);
        mPrice = getIntent().getStringExtra(EXTRA_PRICE);
        mDesc = getIntent().getStringExtra(EXTRA_DESC);
        mImg = getIntent().getIntExtra(EXTRA_PIC, 0);

        getType.setText(mType);
        getPrice.setText(mPrice);
        getDesc.setText(mDesc);
        getImg.setImageResource(mImg);

    }
}

package com.example.android.hyderabad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class detailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle bundle = getIntent().getExtras();
        String place = bundle.getString(getString(R.string.d_title));
        int img = bundle.getInt(getString(R.string.d_image));
        String description = bundle.getString(getString(R.string.d_desc));
        String phone = bundle.getString(getString(R.string.d_phone));
        String time = bundle.getString(getString(R.string.d_time));
        String cost = bundle.getString(getString(R.string.d_cost));
        String address = bundle.getString(getString(R.string.d_address));
        final String url = bundle.getString(getString(R.string.d_url));
        final float latitude = bundle.getFloat(getString(R.string.d_latitude));
        final float longitude = bundle.getFloat(getString(R.string.d_longitude));
        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setImageResource(img);
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(place);
        TextView desc = (TextView) findViewById(R.id.context);
        desc.setText(description);
        TextView phon = (TextView) findViewById(R.id.phone);
        phon.setText(phone);
        TextView tim = (TextView) findViewById(R.id.time);
        tim.setText(time);
        TextView costs = (TextView) findViewById(R.id.cost);
        costs.setText(cost);
        TextView addres = (TextView) findViewById(R.id.address);
        addres.setText(address);
        ImageView iurl = (ImageView) findViewById(R.id.url);
        iurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW);
                urlintent.setData(Uri.parse(url));
                Toast.makeText(detailActivity.this, R.string.open_website, Toast.LENGTH_SHORT).show();
                startActivity(urlintent);
            }
        });
        ImageView maps = (ImageView) findViewById(R.id.maps);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", latitude, longitude);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                Toast.makeText(detailActivity.this, R.string.open_map, Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        try {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        } catch (Exception e) {
        }
    }
}

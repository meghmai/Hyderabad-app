package com.example.android.hyderabad;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by lenovo on 6/3/2017.
 */

public class placePagerAdapter extends ArrayAdapter<words> {
    private Context context = getContext();
    private int mcolor;

    public placePagerAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<words> objects, int color) {
        super(context, resource, objects);
        mcolor = color;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.words, parent, false);
        }
        words currentWord = getItem(position);
        TextView place = (TextView) listItemView.findViewById(R.id.text1);
        place.setText(currentWord.getMplace());
        TextView address = (TextView) listItemView.findViewById(R.id.text2);
        address.setText(currentWord.getMaddress());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getMimg());
        RatingBar ratingBar = (RatingBar) listItemView.findViewById(R.id.rating_bar);
        ratingBar.setRating(currentWord.getMrating());
        View textcontainer = listItemView.findViewById(R.id.rootView);
        int color = ContextCompat.getColor(getContext(), mcolor);
        textcontainer.setBackgroundColor(color);
        final Intent itemIntent = new Intent(context, detailActivity.class);
        itemIntent.putExtra(context.getString(R.string.d_image), currentWord.getMimg());
        itemIntent.putExtra(context.getString(R.string.d_title), currentWord.getMplace());
        itemIntent.putExtra(context.getString(R.string.d_desc), currentWord.getMdescription());
        itemIntent.putExtra(context.getString(R.string.d_time), currentWord.getMtime());
        itemIntent.putExtra(context.getString(R.string.d_cost), currentWord.getMcost());
        itemIntent.putExtra(context.getString(R.string.d_phone), currentWord.getMphone());
        itemIntent.putExtra(context.getString(R.string.d_address), currentWord.getMaddress());
        itemIntent.putExtra(context.getString(R.string.d_url), currentWord.getMurl());
        itemIntent.putExtra(context.getString(R.string.d_latitude), currentWord.getMlatitude());
        itemIntent.putExtra(context.getString(R.string.d_longitude), currentWord.getMlongitude());
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, R.string.open_details, Toast.LENGTH_SHORT).show();
                context.startActivity(itemIntent);
            }
        });
        return listItemView;
    }
}

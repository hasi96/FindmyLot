package com.example.hasitha.bookmylot;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
/**
 * Created by hasitha on 21/11/15.
 **/
public class Mapmarkadapter extends ArrayAdapter<Mapmark> {
    Context context;
    private ArrayList<Mapmark> teams;

    public Mapmarkadapter(Context context, int textViewResourceId, ArrayList<Mapmark> items) {
        super(context, textViewResourceId, items);
        this.context = context;
        this.teams = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(com.example.hasitha.bookmylot.R.layout.team, null);
        }
        Mapmark o = teams.get(position);
        if (o != null) {
            TextView name = (TextView) v.findViewById(com.example.hasitha.bookmylot.R.id.name);
            TextView image = (TextView) v.findViewById(com.example.hasitha.bookmylot.R.id.image);
            TextView latitude = (TextView) v.findViewById(com.example.hasitha.bookmylot.R.id.latitude);
            TextView longitude = (TextView) v.findViewById(com.example.hasitha.bookmylot.R.id.longitude);



            name.setText(String.valueOf(o.getName()));
            image.setText(String.valueOf(o.getImage()));
            latitude.setText(String.valueOf(o.getLatitude()));
            longitude.setText(String.valueOf(o.getLongitude()));

        }
        return v;
    }
}

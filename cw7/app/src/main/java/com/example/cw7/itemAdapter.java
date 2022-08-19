package com.example.cw7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class itemAdapter extends ArrayAdapter {
    List <Items> itemsList;
    public itemAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        itemsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
      View view = LayoutInflater.from(getContext()).inflate(R.layout.itemrow, parent, false);

      Items item =itemsList.get(position);

        TextView itemname = view.findViewById(R.id.itamename);
        TextView itemprice = view.findViewById(R.id.itemprice);
        ImageView itemimage = view.findViewById(R.id.itemimage);


        itemname.setText(item.getItemName());
        itemprice.setText(item.getItemPrice());
        itemimage.setImageResource(item.getItemImage());

        return view;
    }
}

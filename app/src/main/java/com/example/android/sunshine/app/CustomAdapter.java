package com.example.android.sunshine.app;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Saurabhg on 20-02-2016.
 */
public class CustomAdapter implements ListAdapter {

    private  Context context;
    private  List<String> listitems;

    public CustomAdapter(Context context){
        this.context = context;
        listitems = new ArrayList<String>();
        listitems.add("first");
        listitems.add("second");
        listitems.add("third");
        listitems.add("fourth");
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return listitems.size();
    }

    @Override
    public Object getItem(int position) {
        return listitems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

       // if(convertView ==null) {
             convertView = inflater.inflate(R.layout.list_weather, parent, false);
            TextView textView = (TextView) convertView.findViewById(R.id.textview);
           // convertView.setTag();
      //  }
        textView.setText(listitems.get(position));
        return textView;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}

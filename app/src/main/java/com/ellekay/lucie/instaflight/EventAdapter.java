package com.ellekay.lucie.instaflight;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by lucie on 10/27/15.
 */
public class EventAdapter extends BaseAdapter{
    private Context mContext;
    private String[] titles;
    private int[]imageId;

    public EventAdapter(Context c, String[] titles){
        mContext = c;
        this.titles = titles;
        this.imageId = imageId;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;

        if(convertView == null){
            gridView = new View(mContext);

            gridView = inflater.inflate(R.layout.grid_item, null);

            TextView titleText = (TextView) gridView.findViewById(R.id.gridTxt);
            titleText.setText(titles[position]);
        }else {
            gridView = (View)convertView;
        }
        return gridView;
    }
}

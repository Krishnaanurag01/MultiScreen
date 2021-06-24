package com.example.multiscreen;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter<words> {

    private int color;

    public wordAdapter(Activity activity, ArrayList<words> arrayList,int clr){
        super(activity,0,arrayList);
        color=clr;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list,parent,false);
        }

        words currentword=getItem(position);
        TextView miwokTextview=(TextView) listItemView.findViewById(R.id.mihok_text);
        miwokTextview.setText(currentword.getmMiwokTranslation());

        TextView defaultTextview=(TextView) listItemView.findViewById(R.id.default_text);
        defaultTextview.setText(currentword.getMdefaultTranslation());

        ImageView mihokImage = (ImageView) listItemView.findViewById(R.id.item_img);
        if(currentword.hasImage()) {
            mihokImage.setImageResource(currentword.getMihokImage());
        }
        else {
            mihokImage.setVisibility(View.GONE);
        }

        View textContainer = (LinearLayout) listItemView.findViewById(R.id.backColor);
        textContainer.setBackgroundColor(ContextCompat.getColor(getContext(),color));

        return listItemView;

    }
}

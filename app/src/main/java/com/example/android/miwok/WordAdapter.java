package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by victo on 5/29/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceID;

    //Adapter Method
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceID) {
        super(context, 0, words);
        mColorResourceID = colorResourceID;
    }


    @NonNull
    @Override
    //getView method
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        //find views by ID
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        View iconContainer = listItemView.findViewById(R.id.play_icon);
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        textContainer.setBackgroundColor(color);
        iconContainer.setBackgroundColor(color);

        return listItemView;
    }
}

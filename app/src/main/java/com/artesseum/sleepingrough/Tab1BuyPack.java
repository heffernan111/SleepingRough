package com.artesseum.sleepingrough;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * Created by Heffman on 06/08/2017.
 */

public class Tab1BuyPack extends Fragment {


    ImageButton but1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1buypack, container, false);
        but1 = (ImageButton) rootView.findViewById(R.id.imageButton3);





        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Test 1", Toast.LENGTH_LONG).show();
            }
        });







        return rootView;




    }







}

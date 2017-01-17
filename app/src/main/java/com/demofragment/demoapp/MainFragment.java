package com.demofragment.demoapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.demofragment.demoapp.communicate.CommunicateActivity;
import com.demofragment.demoapp.dynamicload.DynamicLoadActivity;
import com.demofragment.demoapp.staticload.StaticLoadActivity;
import com.demofragment.demoapp.tabdemo.TabDemoActivity;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainFragment extends Fragment {

    Button staticLoadButton, dynamicLoadButton, communicateButton, tabDemoButton;

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_main, container, false);

        // init view
        staticLoadButton = (Button) root.findViewById(R.id.staticLoadButton);
        dynamicLoadButton = (Button) root.findViewById(R.id.dynamicLoadButton);
        communicateButton = (Button) root.findViewById(R.id.communicateButton);
        tabDemoButton = (Button) root.findViewById(R.id.tabDemoButton);

        // set listener
        setListener();

        return root;
    }

    private void setListener(){
        staticLoadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), StaticLoadActivity.class);
                startActivity(intent);
            }
        });

        dynamicLoadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), DynamicLoadActivity.class);
                startActivity(intent);
            }
        });

        communicateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), CommunicateActivity.class);
                startActivity(intent);
            }
        });

        tabDemoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), TabDemoActivity.class);
                startActivity(intent);
            }
        });
    }
}

package com.demofragment.demoapp.tabdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.demofragment.demoapp.R;

/**
 * Created by obvyah on 16/12/4.
 */
public class TabDemoFragment extends Fragment {

    /**
     * add this static method for creating new TabDemoFragment to use
     */
    public static Fragment newInstance(int position, String tabName){
        Fragment f = new TabDemoFragment();
        Bundle extras = new Bundle();
        extras.putInt("POSITION", position);
        extras.putString("TAB_NAME", tabName);
        f.setArguments(extras);
        return f;
    }

    /** the extra data of this fragment */
    private int position = 0;
    private String tabName = "";

    public final String LOG_TAG_LIFECYCLE = "lifecycle";

    private TextView hintTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(LOG_TAG_LIFECYCLE, "fragment: onCreate");

        //get argument
        Bundle extras = getArguments();
        this.position = extras.getInt("POSITION");
        this.tabName = extras.getString("TAB_NAME");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d(LOG_TAG_LIFECYCLE, "fragment: onCreateView");

        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_tab_demo, container, false);

        // Init view
        hintTextView = (TextView) root.findViewById(R.id.hintTextView);

        // Init value
        initValue();

        return root;
    }

    private void initValue(){
        String hindText =
                "hello! this is "+tabName+"\n"+
                "position: "+position;
        hintTextView.setText(hindText);
    }


    /** added for demo lifecycle of the activity and fragment */
    @Override
    public void onAttach(Context context){
        super.onAttach(context);

        Log.d(LOG_TAG_LIFECYCLE, "fragment: onAttach");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        Log.d(LOG_TAG_LIFECYCLE, "fragment: onActivityCreated");
    }

    @Override
    public void onStart(){
        super.onStart();

        Log.d(LOG_TAG_LIFECYCLE, "fragment: onStart");
    }

    @Override
    public void onResume(){
        super.onResume();

        Log.d(LOG_TAG_LIFECYCLE, "fragment: onResume");
    }

    @Override
    public void onPause(){
        Log.d(LOG_TAG_LIFECYCLE, "fragment: onPause");

        super.onPause();
    }

    @Override
    public void onStop(){
        Log.d(LOG_TAG_LIFECYCLE, "fragment: onStop");

        super.onStop();
    }

    @Override
    public void onDestroyView(){
        Log.d(LOG_TAG_LIFECYCLE, "fragment: onDestroyView");

        super.onDestroyView();
    }

    @Override
    public void onDestroy(){
        Log.d(LOG_TAG_LIFECYCLE, "fragment: onDestroy");

        super.onDestroy();
    }

    @Override
    public void onDetach(){
        Log.d(LOG_TAG_LIFECYCLE, "fragment: onDetach");

        super.onDetach();
    }

}
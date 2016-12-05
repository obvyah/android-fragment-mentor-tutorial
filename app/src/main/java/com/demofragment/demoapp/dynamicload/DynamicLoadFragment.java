package com.demofragment.demoapp.dynamicload;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demofragment.demoapp.R;

/**
 * Created by obvyah on 16/12/4.
 */
public class DynamicLoadFragment extends Fragment {

    public final String LOG_TAG_LIFECYCLE = "lifecycle";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.d(LOG_TAG_LIFECYCLE, "fragment: onCreateView");

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dynamic_load, container, false);
    }


    /** added for demo lifecycle of the activity and fragment */
    @Override
    public void onAttach(Context context){
        super.onAttach(context);

        Log.d(LOG_TAG_LIFECYCLE, "fragment: onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(LOG_TAG_LIFECYCLE, "fragment: onCreate");
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
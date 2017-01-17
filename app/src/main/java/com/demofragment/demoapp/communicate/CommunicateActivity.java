package com.demofragment.demoapp.communicate;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.demofragment.demoapp.R;
import com.demofragment.demoapp.dynamicload.DynamicLoadFragment;

public class CommunicateActivity extends AppCompatActivity implements CommunicateFragment.OnToolbarListener {

    public final String LOG_TAG_LIFECYCLE = "lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communicate);

        // Only if this is a new activity, so fragments don't exist yet.
        if (savedInstanceState == null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flContainer, new CommunicateFragment());
            ft.commit();
        }

        Log.d(LOG_TAG_LIFECYCLE, "activity: onCreate");
    }

    /** added for demo lifecycle of the activity and fragment */
    @Override
    protected void onStart(){
        super.onStart();

        Log.d(LOG_TAG_LIFECYCLE, "activity: onStart");
    }

    @Override
    protected void onRestart(){
        super.onRestart();

        Log.d(LOG_TAG_LIFECYCLE, "activity: onRestart");
    }

    @Override
    protected void onResume(){
        super.onResume();

        Log.d(LOG_TAG_LIFECYCLE, "activity: onResume");
    }

    @Override
    protected void onPause(){
        Log.d(LOG_TAG_LIFECYCLE, "activity: onPause");

        super.onPause();
    }

    @Override
    protected void onStop(){
        Log.d(LOG_TAG_LIFECYCLE, "activity: onStop");

        super.onStop();
    }

    @Override
    protected void onDestroy(){
        Log.d(LOG_TAG_LIFECYCLE, "activity: onDestroy");

        super.onDestroy();
    }

    /** Menu */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Toolbar Listener */
    @Override
    public void onUpdateToolbarTitle(String text) {
        getSupportActionBar().setTitle(text);
    }
}

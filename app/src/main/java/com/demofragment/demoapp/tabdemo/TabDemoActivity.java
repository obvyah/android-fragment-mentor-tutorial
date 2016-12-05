package com.demofragment.demoapp.tabdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.astuetz.PagerSlidingTabStrip;
import com.demofragment.demoapp.R;

public class TabDemoActivity extends FragmentActivity {

    public final String LOG_TAG_LIFECYCLE = "lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_demo);

        // Get the ViewPager and set it's PagerAdapter so that it can display items
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));
        // Give the PagerSlidingTabStrip the ViewPager
        PagerSlidingTabStrip tabsStrip = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        // Attach the view pager to the tab strip
        tabsStrip.setViewPager(viewPager);

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
}

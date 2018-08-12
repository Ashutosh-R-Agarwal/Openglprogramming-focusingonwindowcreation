package com.astromedicomp.mywindow;

// default supplied packages by android SDK
import android.app.Activity;
import android.os.Bundle;

// later added packages
import android.view.Window; // for "Window" class
import android.view.WindowManager; // for "WindowManager" class
import android.content.Context; // for drawing context related
import android.app.ActivityManager; // for ActivityManager

public class MyWindowActivity extends Activity
{
    private MyView myView;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        // this is done to get rid of ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        
        // this is done to make Fullscreen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);

        myView=new MyView(this);
        
        // set view as content view of the activity
        setContentView(myView);
    }
    
    @Override
    protected void onPause()
    {
        super.onPause();
    }
    
    @Override
    protected void onResume()
    {
        super.onResume();
    }
}

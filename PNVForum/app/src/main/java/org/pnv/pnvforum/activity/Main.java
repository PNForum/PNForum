package org.pnv.pnvforum.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ViewFlipper;

import org.pnv.pnvforum.R;
import org.pnv.pnvforum.utils.Utils;

/**
 * Created by Sonhv on 3/9/2016.
 */
public class Main extends Activity{

    private DrawerLayout drawer;
    private FrameLayout viewShowMenu;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.layout_main);

        drawer = (DrawerLayout) findViewById(R.id.drawer_main);
        viewShowMenu = (FrameLayout) findViewById(R.id.frame_menu);

        Utils.showFragmentMenu(this, drawer, viewShowMenu);
        Utils.showFragmentHome(this, drawer, viewShowMenu);

    }

    public static boolean isSmoothDetail = false;
    @Override
    public void onBackPressed(){
        if (isSmoothDetail){
            Utils.smoothMain(this);
            isSmoothDetail = false;
        }
        Utils.closeMenu(drawer, viewShowMenu);
    }

    public static boolean isForumOrDiscussShown = false;
    private float lastY;
    // Method to handle touch event like left to right swap and right to left swap
    @Override
    public boolean dispatchTouchEvent(MotionEvent touchEvent)
    {
        switch (touchEvent.getAction())
        {

            // when user first touches the screen to swap
            case MotionEvent.ACTION_DOWN:
            {
                lastY = touchEvent.getY();
                break;
            }

            case MotionEvent.ACTION_UP:
            {
                float currentY = touchEvent.getY();

                // if move to down swipe on screen
                if (lastY < currentY)
                {
                    if (isForumOrDiscussShown){
                        LinearLayout layoutMenuTypeObject = (LinearLayout) findViewById(R.id.layout_menu_type_object);
                        LinearLayout layoutTypeObject = (LinearLayout) findViewById(R.id.layout_type_object);
                        layoutMenuTypeObject.setVisibility(View.VISIBLE);
                        layoutTypeObject.setVisibility(View.VISIBLE);
                        layoutMenuTypeObject.animate().translationY(0).start();
                        layoutTypeObject.animate().translationY(0).start();
                    }
                }

                // if move to up swipe on screen
                if (lastY > currentY)
                {
                    if (isForumOrDiscussShown){
                        LinearLayout layoutMenuTypeObject = (LinearLayout) findViewById(R.id.layout_menu_type_object);
                        LinearLayout layoutTypeObject = (LinearLayout) findViewById(R.id.layout_type_object);
                        layoutMenuTypeObject.setVisibility(View.INVISIBLE);
                        layoutTypeObject.setVisibility(View.INVISIBLE);
                        layoutMenuTypeObject.animate().translationYBy(-100).start();
                        layoutTypeObject.animate().translationYBy(-100).start();
                    }
                }
                break;
            }
        }
        return super.dispatchTouchEvent(touchEvent);
    }
}

package org.pnv.pnvforum.utils;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import org.pnv.pnvforum.R;
import org.pnv.pnvforum.activity.Login;
import org.pnv.pnvforum.activity.Main;
import org.pnv.pnvforum.fragment.FragmentAboutUs;
import org.pnv.pnvforum.fragment.FragmentDiscuss;
import org.pnv.pnvforum.fragment.FragmentForum;
import org.pnv.pnvforum.fragment.FragmentHome;
import org.pnv.pnvforum.fragment.FragmentLogin;
import org.pnv.pnvforum.fragment.FragmentMenu;
import org.pnv.pnvforum.fragment.FragmentPostDetail;
import org.pnv.pnvforum.fragment.FragmentProfile;
import org.pnv.pnvforum.fragment.FragmentRegister;

/**
 * Created by Sonhv on 3/11/2016.
 */
public class Utils {
    /**** Method for Setting the Height of the ListView dynamically.
     **** Hack to fix the issue of not showing all the items of the ListView
     **** when placed inside a ScrollView  ****/
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null)
            return;

        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), View.MeasureSpec.UNSPECIFIED);
        int totalHeight = 0;
        View view = null;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            view = listAdapter.getView(i, view, listView);
            if (i == 0)
                view.setLayoutParams(new ViewGroup.LayoutParams(desiredWidth, ViewGroup.LayoutParams.WRAP_CONTENT));

            view.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            totalHeight += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }

    public static void showFragmentHome(Activity activity, DrawerLayout drawer, View viewShowMenu){
        FragmentHome fragmentHome = new FragmentHome();
        fragmentHome.setUp(activity, drawer, viewShowMenu);
        FragmentTransaction ftHome = activity.getFragmentManager().beginTransaction();
        ftHome.add(R.id.frame_container, fragmentHome);
        ftHome.commit();
    }

    public static void showFragmentLogin(Activity activity){
        FragmentLogin fragmentLogin = new FragmentLogin();
        fragmentLogin.setUp(activity);
        FragmentTransaction ftLogin = activity.getFragmentManager().beginTransaction();
        ftLogin.add(R.id.frame_login, fragmentLogin);
        ftLogin.commit();
    }

    public static void showFragmentRegister(Activity activity){
        FragmentRegister fragmentRegister = new FragmentRegister();
        fragmentRegister.setUp(activity);
        FragmentTransaction ftRegister = activity.getFragmentManager().beginTransaction();
        ftRegister.add(R.id.frame_register, fragmentRegister);
        ftRegister.commit();
    }

    public static void showFragmentAboutUs(Activity activity, DrawerLayout drawer, View viewShowMenu){
        FragmentAboutUs fragmentAboutUs = new FragmentAboutUs();
        fragmentAboutUs.setUp(activity, drawer, viewShowMenu);
        FragmentTransaction ftAboutUs = activity.getFragmentManager().beginTransaction();
        ftAboutUs.add(R.id.frame_container, fragmentAboutUs);
        ftAboutUs.commit();
    }

    public static void showFragmentDiscuss(Activity activity, DrawerLayout drawer, View viewShowMenu){
        FragmentDiscuss fragmentDiscuss = new FragmentDiscuss();
        fragmentDiscuss.setUp(activity, drawer, viewShowMenu);
        FragmentTransaction ftDiscuss = activity.getFragmentManager().beginTransaction();
        ftDiscuss.add(R.id.frame_container, fragmentDiscuss);
        ftDiscuss.commit();
        Main.isForumOrDiscussShown = true;
    }

    public static void showFragmentForum(Activity activity, DrawerLayout drawer, View viewShowMenu){ // change if want to modify
        FragmentForum fragmentForum = new FragmentForum();
        fragmentForum.setUp(activity, drawer, viewShowMenu);
        FragmentTransaction ftDiscuss = activity.getFragmentManager().beginTransaction();
        ftDiscuss.add(R.id.frame_container, fragmentForum);
        ftDiscuss.commit();
        Main.isForumOrDiscussShown = true;
    }

    public static void showFragmentMenu(Activity activity, DrawerLayout drawer, View viewShowMenu){
        FragmentMenu fragmentMenu = new FragmentMenu();
        fragmentMenu.setUp(activity, drawer, viewShowMenu);
        FragmentTransaction ftMenu = activity.getFragmentManager().beginTransaction();
        ftMenu.add(R.id.frame_menu, fragmentMenu);
        ftMenu.commit();
    }

    public static void showFragmentPostDetail(Activity activity, DrawerLayout drawer, View viewShowMenu){
        FragmentPostDetail fragmentPostDetail = new FragmentPostDetail();
        fragmentPostDetail.setUp(activity, drawer, viewShowMenu);
        FragmentTransaction ftPostDetail = activity.getFragmentManager().beginTransaction();
        ftPostDetail.add(R.id.frame_detail, fragmentPostDetail);
        ftPostDetail.commit();
    }

    public static void showFragmentProfile(Activity activity){
        FragmentProfile fragmentProfile = new FragmentProfile();
        fragmentProfile.setUp(activity);
        FragmentTransaction ftProfile = activity.getFragmentManager().beginTransaction();
        ftProfile.add(R.id.frame_menu, fragmentProfile);
        ftProfile.commit();
    }

    public static void smoothToLogin(Activity activity){
        if (Login.isSmoothRegister){
            Login.isSmoothRegister = false;
            ViewFlipper viewFlipper  = (ViewFlipper) activity.findViewById(R.id.vflp_login);
            viewFlipper.setInAnimation(activity, R.anim.in_from_right);
            viewFlipper.setOutAnimation(activity, R.anim.out_to_left);
            // Show the next Screen
            viewFlipper.showNext();
        }
    }

    public static void smoothToRegister(Activity activity){
        if (!Login.isSmoothRegister){
            Login.isSmoothRegister = true;
            ViewFlipper viewFlipper  = (ViewFlipper) activity.findViewById(R.id.vflp_login);
            viewFlipper.setInAnimation(activity, R.anim.in_from_left);
            viewFlipper.setOutAnimation(activity, R.anim.out_to_right);
            // Show the next Screen
            viewFlipper.showNext();
        }
    }

    public static void smoothDetail(Activity activity){
        if (!Main.isSmoothDetail){
            Main.isSmoothDetail = true;
            ViewFlipper viewFlipper  = (ViewFlipper) activity.findViewById(R.id.vflp_show_detail);
            viewFlipper.setInAnimation(activity, R.anim.in_from_left);
            viewFlipper.setOutAnimation(activity, R.anim.out_to_right);
            // Show the next Screen
            viewFlipper.showNext();
        }
    }

    public static void smoothMain(Activity activity){
        if (Main.isSmoothDetail){
            Main.isSmoothDetail = false;
            ViewFlipper viewFlipper  = (ViewFlipper) activity.findViewById(R.id.vflp_show_detail);
            viewFlipper.setInAnimation(activity, R.anim.in_from_right);
            viewFlipper.setOutAnimation(activity, R.anim.out_to_left);
            // Show the next Screen
            viewFlipper.showNext();
        }
    }

    public static void closeMenu(DrawerLayout drawer, View viewShowMenu){
        if (drawer.isDrawerOpen(viewShowMenu)) {
            drawer.closeDrawer(viewShowMenu);
        }
    }

    public static void openMenu(DrawerLayout drawer, View viewShowMenu){
        if (!drawer.isDrawerOpen(viewShowMenu)) {
            drawer.openDrawer(viewShowMenu);
        }
    }

    public static void initTitleBar(Button menu, ImageView iconTitle_bar, int initIconTitlebar
            , TextView tvTitleBar, String initTvTitleBar, Button btnSearch, EditText edtSearch
            , final DrawerLayout drawer, final View viewShowMenu){

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenu(drawer, viewShowMenu);
            }
        });

        iconTitle_bar.setImageResource(initIconTitlebar);
        tvTitleBar.setText(initTvTitleBar);
    }
}

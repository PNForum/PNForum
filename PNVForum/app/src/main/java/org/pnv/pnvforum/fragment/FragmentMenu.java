package org.pnv.pnvforum.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import org.pnv.pnvforum.R;
import org.pnv.pnvforum.activity.Login;
import org.pnv.pnvforum.activity.Main;
import org.pnv.pnvforum.adapter.MenuItemTopic;
import org.pnv.pnvforum.utils.Utils;

/**
 * Created by Sonhv on 3/10/2016.
 */
public class FragmentMenu extends Fragment {

    private MenuItemTopic menuItemTopic;
    private Activity activity;
    private DrawerLayout drawer;
    private View viewShowMenu;

    public void setUp(Activity activity, DrawerLayout drawer, View viewShowMenu){
        this.activity = activity;
        this.drawer = drawer;
        this.viewShowMenu = viewShowMenu;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;  // control view here
        view = inflater.inflate(R.layout.layout_menu, container, false);
        ListView listView = (ListView) view.findViewById(R.id.lv_item_topic);
        menuItemTopic = new MenuItemTopic(getActivity().getApplicationContext());
        listView.setAdapter(menuItemTopic);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long offset) {
                Main.isForumOrDiscussShown = false;
                switch (position){
                    case 0:
                        Utils.showFragmentHome(activity, drawer, viewShowMenu);
                        break;
                    case 1:
                        Utils.showFragmentDiscuss(activity, drawer, viewShowMenu);
                        break;
                    case 2:
                        Utils.showFragmentForum(activity, drawer, viewShowMenu);
                        break;
                    case 3:
                        Utils.showFragmentAboutUs(activity, drawer, viewShowMenu);
                        break;
                    case 4:
                        Intent login = new Intent(activity, Login.class);
                        startActivity(login);
                        break;
                    default:
                        break;
                }
                Utils.closeMenu(drawer, viewShowMenu);
                Utils.smoothMain(activity);
            }
        });

        // set focus in the header
        listView.setFocusable(false);
        Utils.setListViewHeightBasedOnChildren(listView);
        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

}

package org.pnv.pnvforum.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.pnv.pnvforum.R;
import org.pnv.pnvforum.utils.Utils;

/**
 * Created by Sonhv on 3/11/2016.
 */
public class FragmentAboutUs extends Fragment {

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
        View view;
        view = inflater.inflate(R.layout.layout_about_us, container, false);

        // init title bar
        Button menu = (Button)view.findViewById(R.id.btn_show_slide_menu);
        ImageView iconTitle_bar = (ImageView) view.findViewById(R.id.imgv_icon_title_bar);
        TextView tvTitleBar = (TextView) view.findViewById(R.id.tv_title_bar);
        EditText edtSearch = (EditText) view.findViewById(R.id.edt_search);
        Button btnSearch = (Button) view.findViewById(R.id.btn_search);
        Utils.initTitleBar(menu, iconTitle_bar, R.drawable.ic_about_us, tvTitleBar, "About Us"
                , btnSearch, edtSearch, drawer, viewShowMenu);
// control view here
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

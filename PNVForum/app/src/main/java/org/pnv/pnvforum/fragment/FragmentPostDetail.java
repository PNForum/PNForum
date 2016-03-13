package org.pnv.pnvforum.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.pnv.pnvforum.R;
import org.pnv.pnvforum.adapter.Comment;
import org.pnv.pnvforum.utils.Utils;

/**
 * Created by Sonhv on 3/11/2016.
 */
public class FragmentPostDetail extends Fragment {

    private Comment comment;

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
        View view; // control view here
        view = inflater.inflate(R.layout.layout_post_detail, container, false);

        // init title bar
        Button menu = (Button)view.findViewById(R.id.btn_show_slide_menu);
        ImageView iconTitle_bar = (ImageView) view.findViewById(R.id.imgv_icon_title_bar);
        TextView tvTitleBar = (TextView) view.findViewById(R.id.tv_title_bar);
        EditText edtSearch = (EditText) view.findViewById(R.id.edt_search);
        Button btnSearch = (Button) view.findViewById(R.id.btn_search);

        menu.setBackgroundResource(R.drawable.ic_back);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.smoothMain(activity);
            }
        });
        iconTitle_bar.setImageResource(R.drawable.ic_detail);
        tvTitleBar.setText("Chi tiết");

        // init comment
        ListView listView = (ListView) view.findViewById(R.id.lv_post_detail_comment);
        comment = new Comment(getActivity().getApplicationContext());
        listView.setAdapter(comment);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long offset) {

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

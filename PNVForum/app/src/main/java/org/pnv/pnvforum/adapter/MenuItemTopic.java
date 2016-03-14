package org.pnv.pnvforum.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.pnv.pnvforum.R;

import java.util.ArrayList;

/**
 * Created by Sonhv on 3/10/2016.
 */
public class MenuItemTopic extends BaseAdapter {

    private ArrayList<Topic> listTopic;
    private LayoutInflater layoutInflater;

    public MenuItemTopic(Context context){
        listTopic = new ArrayList<>();
        listTopic.add(new Topic(R.drawable.ic_home, "Home"));
        listTopic.add(new Topic(R.drawable.ic_discuss, "Discuss"));
        listTopic.add(new Topic(R.drawable.ic_forum, "Forum"));
        listTopic.add(new Topic(R.drawable.ic_about_us, "About Us"));
        listTopic.add(new Topic(R.drawable.ic_login, "Logout"));
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listTopic.size();
    }

    @Override
    public Object getItem(int position) {
        if (position > this.listTopic.size()){
            return null;
        }
        return listTopic.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemTopic itemTopic;
        if (convertView == null){
            convertView = layoutInflater.inflate(R.layout.menu_item_topic, null);
            itemTopic = new ItemTopic();
            itemTopic.imgvIcon = (ImageView) convertView.findViewById(R.id.imgv_icon_item_menu);
            itemTopic.tvTitle = (TextView) convertView.findViewById(R.id.tv_item_topic);
            convertView.setTag(itemTopic);
        }else{
            itemTopic = (ItemTopic) convertView.getTag();
        }

        itemTopic.imgvIcon.setImageResource(listTopic.get(position).getImg());
        itemTopic.tvTitle.setText(listTopic.get(position).getTitle());

        return convertView;
    }

    private class Topic{
        private int img;
        private String title;

        public Topic(int img, String title){
            this.title = title;
            this.img = img;
        }

        public int getImg() {
            return img;
        }

        public String getTitle() {
            return title;
        }
    }

    private class ItemTopic{
        public ImageView imgvIcon;
        public TextView tvTitle;
    }
}

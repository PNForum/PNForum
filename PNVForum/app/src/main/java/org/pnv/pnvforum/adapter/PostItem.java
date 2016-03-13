package org.pnv.pnvforum.adapter;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import org.pnv.pnvforum.R;
import org.pnv.pnvforum.utils.Utils;

/**
 * Created by Sonhv on 3/10/2016.
 */
public class PostItem extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private Activity activity;
    private DrawerLayout drawer;
    private View viewShowDetail;

    public PostItem(Activity activity, DrawerLayout drawer, View viewShowMenu){
        this.activity = activity;
        layoutInflater = LayoutInflater.from(activity);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Item item;
        if (convertView == null){
            convertView = layoutInflater.inflate(R.layout.post_item, null);
            item = new Item();
            item.imgvPostItemAuthor = (ImageView) convertView.findViewById(R.id.imgv_post_item_author);
            item.imgvPostItemImage = (ImageView) convertView.findViewById(R.id.imgv_post_item_image);
            item.btnPostItemComment = (Button) convertView.findViewById(R.id.btn_post_item_comment);
            item.btnPostItemLike = (Button) convertView.findViewById(R.id.btn_post_item_like);
            item.btnPostItemSave = (Button) convertView.findViewById(R.id.btn_post_item_others_option);
            item.btnPostItemView = (Button) convertView.findViewById(R.id.btn_post_item_view);
            item.tvPostItemAuthor = (TextView) convertView.findViewById(R.id.tv_post_item_author);
            item.tvPostItemComment = (TextView) convertView.findViewById(R.id.tv_post_item_comment);
            item.tvPostItemContent = (TextView) convertView.findViewById(R.id.tv_post_item_content);
            item.tvPostItemDate = (TextView) convertView.findViewById(R.id.tv_post_item_date);
            item.tvPostItemLike = (TextView) convertView.findViewById(R.id.tv_post_item_like);
            item.tvPostItemTitle = (TextView) convertView.findViewById(R.id.tv_post_item_title);
            item.tvPostItemView = (TextView) convertView.findViewById(R.id.tv_post_item_view);
            convertView.setTag(item);
        }else{
            item = (Item) convertView.getTag();
        }

        // demo
        item.imgvPostItemAuthor.setImageResource(R.drawable.ic_avatar_default);
        item.imgvPostItemImage.setImageResource(R.drawable.ic_discuss);
        item.btnPostItemComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.showFragmentPostDetail(activity, drawer, viewShowDetail);
                Utils.smoothDetail(activity);
            }
        });
        item.btnPostItemLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item.btnPostItemLike.setBackgroundResource(R.drawable.ic_not_like);
            }
        });
//        item.btnPostItemSave = (Button) convertView.findViewById(R.id.btn_post_item_save);
//        item.btnPostItemView = (Button) convertView.findViewById(R.id.btn_post_item_view);
        item.tvPostItemAuthor.setText("Huỳnh Văn Sơn");
        item.tvPostItemComment.setText("100");
        item.tvPostItemContent.setText("Bài đăng demo");
        item.tvPostItemDate.setText("10/03/2016 16:18");
        item.tvPostItemLike.setText("1k");
        item.tvPostItemTitle.setText("Bài Đăng Demo");
        item.tvPostItemView.setText("2k");

        return convertView;
    }

    private class Item{
        public ImageView imgvPostItemAuthor;
        public ImageView imgvPostItemImage;
        public Button btnPostItemLike;
        public Button btnPostItemComment;
        public Button btnPostItemView;
        public Button btnPostItemSave;
        public TextView tvPostItemAuthor;
        public TextView tvPostItemDate;
        public TextView tvPostItemTitle;
        public TextView tvPostItemContent;
        public TextView tvPostItemLike;
        public TextView tvPostItemComment;
        public TextView tvPostItemView;
    }
}

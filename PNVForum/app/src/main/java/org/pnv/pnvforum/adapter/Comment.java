package org.pnv.pnvforum.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.pnv.pnvforum.R;

/**
 * Created by Sonhv on 3/11/2016.
 */
public class Comment extends BaseAdapter{

    private LayoutInflater layoutInflater;

    public Comment(Context context){
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 3;
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

        CommentItem commentItem;
        if (convertView == null){
            convertView = layoutInflater.inflate(R.layout.comment_item, null);
            commentItem = new CommentItem();
            commentItem.imgvCommentItemAuthor = (ImageView) convertView.findViewById(R.id.imgv_comment_item_author);
            commentItem.btnCommentItemLike = (Button) convertView.findViewById(R.id.btn_comment_item_like);
            commentItem.btnCommentItemSpam = (Button) convertView.findViewById(R.id.btn_comment_item_spam);
            commentItem.tvCommentItemAuthor = (TextView) convertView.findViewById(R.id.tv_comment_item_author);
            commentItem.tvCommentItemContent = (TextView) convertView.findViewById(R.id.tv_comment_item_content);
            commentItem.tvCommentItemDate = (TextView) convertView.findViewById(R.id.tv_comment_item_date);
            commentItem.tvCommentItemLike = (TextView) convertView.findViewById(R.id.tv_comment_item_like);
            convertView.setTag(commentItem);
        }else{
            commentItem = (CommentItem) convertView.getTag();
        }

        commentItem.imgvCommentItemAuthor.setImageResource(R.drawable.ic_avatar_default);
        commentItem.btnCommentItemLike.setBackgroundResource(R.drawable.ic_not_like);
//        commentItem.btnCommentItemSpam = (Button) convertView.findViewById(R.id.btn_comment_item_spam);
        commentItem.tvCommentItemAuthor.setText("Huỳnh Văn Sơn");
        commentItem.tvCommentItemContent.setText("Bình luận Demo");
        commentItem.tvCommentItemDate.setText("11/03/2016 10:32");
        commentItem.tvCommentItemLike.setText("123");

        return convertView;
    }

    private class CommentItem{
        public ImageView imgvCommentItemAuthor;
        public Button btnCommentItemLike;
        public Button btnCommentItemSpam;
        public TextView tvCommentItemAuthor;
        public TextView tvCommentItemDate;
        public TextView tvCommentItemContent;
        public TextView tvCommentItemLike;
    }
}

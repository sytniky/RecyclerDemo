package edu.hillel.recyclerdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by yuriy on 20.07.16.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<String> mData = new ArrayList<>();
    private OnItemClickListener mListener;

    public MyAdapter(ArrayList<String> mData, OnItemClickListener mlistener) {
        this.mData = mData;
        this.mListener = mlistener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        String str = mData.get(position);
        holder.setData(str);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public interface OnItemClickListener extends View.OnClickListener {
        void onItemClick(int position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle, tvSubTitle;

        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(mListener);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvSubTitle = (TextView) itemView.findViewById(R.id.tvSubTitle);
        }

        public void setData(String str) {
            tvTitle.setText(str);
            tvSubTitle.setText(str);
        }
    }
}

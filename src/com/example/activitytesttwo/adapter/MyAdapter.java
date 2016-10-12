package com.example.activitytesttwo.adapter;

import java.util.List;
import java.util.Map;

import com.example.activitytesttwo.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	
	private Context context;//上下文对象引用
	
	private List<Map<String,Object>> mlData;

	public MyAdapter(Context context,List<Map<String,Object>> list){
		this.context=context;
		this.mlData=list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mlData.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
        convertView=LayoutInflater.from(context).inflate(R.layout.show_list, null);
		
		TextView tvShowNumber=(TextView) convertView.findViewById(R.id.tvShowNumber);
		TextView tvShowTime=(TextView)convertView.findViewById(R.id.tvShowTime);
		TextView tvShowTitle=(TextView)convertView.findViewById(R.id.tvShowTitle);
		ImageView ivIcon=(ImageView)convertView.findViewById(R.id.ivIcon);
		
		tvShowNumber.setText(mlData.get(position).get("num").toString());
		tvShowTime.setText(mlData.get(position).get("time").toString());
		tvShowTitle.setText(mlData.get(position).get("title").toString());
		ivIcon.setImageResource((Integer) mlData.get(position).get("img"));
		return convertView;

	}

}

package com.example.activitytesttwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.activitytesttwo.adapter.MyAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WelcomeActivity extends Activity {

	//����
	ListView lvShow;
	
	private List<String> listOne= new ArrayList<String>();

	private List<Map<String,Object>> listTwo=new ArrayList<Map<String,Object>>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		
		//ע��
		lvShow=(ListView) this.findViewById(R.id.lvShow);
		for(int i=0;i<60;i++){
			Map<String,Object> map=new HashMap<String,Object>();
			map.put("num", i+1);
			map.put("time", "2019-9-14");
			map.put("title", "JXNU"+i);
			map.put("img", R.drawable.ic_launcher);
			listTwo.add(map);
		}
		MyAdapter myadapter=new MyAdapter(WelcomeActivity.this,listTwo);
		lvShow.setAdapter(myadapter);
		
	}
	private void methodOne(){
		for(int i=0;i<6;i++){
			listOne.add("12345");
		}
		//Adapter��ΪSimpleAdapter��SimpleCursorAdapetr
		//һ�������Ҫ�����Զ����Adapter������
		//ͨ��Adapter�����ݵ��ؼ��ϣ���ʹListView�ؼ������Զ���Ĳ���filelist
		ArrayAdapter<String> showListAdapter = new  ArrayAdapter<String>(
						WelcomeActivity.this,R.layout.simple_show_list,listOne);
		//ʵ���б�������ʾ
		lvShow.setAdapter(showListAdapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}

}

package com.project.eng;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.project.eng.collector.Activity_Collector;

public class Base_Activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		Log.e("BaseActivity", getClass().getSimpleName());
		Activity_Collector.addActivity(this);
	}

	@Override
	protected void onDestroy() {
		// TODO 自动生成的方法存根
		super.onDestroy();
		Activity_Collector.removeActivity(this);
	}
}
// 退出程序只需要调用Activity_Collector.finishAll();
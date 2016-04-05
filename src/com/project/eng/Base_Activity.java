package com.project.eng;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.project.eng.collector.Activity_Collector;

public class Base_Activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		Log.e("BaseActivity", getClass().getSimpleName());
		Activity_Collector.addActivity(this);
	}

	@Override
	protected void onDestroy() {
		// TODO �Զ����ɵķ������
		super.onDestroy();
		Activity_Collector.removeActivity(this);
	}
}
// �˳�����ֻ��Ҫ����Activity_Collector.finishAll();
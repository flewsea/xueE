package com.project.eng;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class Second_Activity extends Base_Activity {
	public static void actionStart(Context context, String data1, String data2) {
		Intent intent = new Intent(context, MainActivity.class);
		intent.putExtra("param1", data1);
		intent.putExtra("param2", data2);
		context.startActivity(intent);
	}// 簡潔的數據傳遞代碼，方便查閱、

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);

	}
}

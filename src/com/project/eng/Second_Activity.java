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
	}// �����Ĕ������f���a�������醡�

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);

	}
}

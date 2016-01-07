package com.dailycation.liangtu.ui.enter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.dailycation.liangtu.R;

public class LoginActivity extends Activity implements OnClickListener,LoginInterface{
	private Context mContext;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		initView();
		mContext = this;

	}

	
	public void initView(){
		findViewById(R.id.btn_login).setOnClickListener(this);
		findViewById(R.id.btn_go_register).setOnClickListener(this);
		findViewById(R.id.btn_login_weibo).setOnClickListener(this);
		findViewById(R.id.btn_login_qq).setOnClickListener(this);
		findViewById(R.id.btn_login_weixin).setOnClickListener(this);
	}
	

	
	@Override
	public void onResume(){
		super.onResume();
	}
	
	@Override
	public void onDestroy(){
		super.onDestroy();
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.btn_login_weibo:
			break;
		case R.id.btn_login_qq:
			break;
		case R.id.btn_login_weixin:
			break;
		}
	}

	@Override
	public void login(String phone, String password) {

	}

	@Override
	public void goRegister() {

	}

	@Override
	public void register(String phone, String password, String verifyCode) {

	}
}

package com.mr235.fullscreendialogdemo;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2015/5/6.
 */
public class CallPhoneDialog extends Dialog implements View.OnClickListener {

    private Context mContext;

    public CallPhoneDialog(Context context) {
        super(context, R.style.CustomDialog);
        mContext = context;
        initView();
    }

    public CallPhoneDialog(Context context, int theme) {
        super(context, R.style.CustomDialog);
        mContext = context;
        initView();
    }

    protected CallPhoneDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        mContext = context;
        initView();
    }

    private void initView() {
        // 全屏显示 ： root layout下的子view width设置为match_parent
        setContentView(R.layout.dialog_call_phone);
        getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        initData();
    }

    private void initData() {
        findViewById(R.id.tv_phone).setOnClickListener(this);
        findViewById(R.id.tv_call).setOnClickListener(this);
        findViewById(R.id.tv_add_contact).setOnClickListener(this);
        findViewById(R.id.tv_copy).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }


    @Override
    public void show() {
        Window window = getWindow();
        window.setGravity(Gravity.BOTTOM);
        window.setWindowAnimations(R.style.CustomDialog);  //添加动画
        super.show();
    }
}

package com.utils.csc.cscutils;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.utils.csc.cscutils.activity.CscDialogActivity;
import com.utils.csc.cscutils.base.BaseActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick(R.id.dialog_type)
    public void onClick(View view){
        Intent intent=new Intent();
        switch (view.getId()){
            case R.id.dialog_type:
                intent.setClass(this, CscDialogActivity.class);
                Log.d("csc","sdcard/" +this.getString(this.getApplicationInfo().labelRes));
                break;
        }
        startActivity(intent);
    }
}

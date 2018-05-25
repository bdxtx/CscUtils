package com.utils.csc.cscutils.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.utils.csc.cscutils.R;
import com.utils.csc.cscutils.base.BaseActivity;
import com.utils.csc.cscutils.view.dialog.CscDialog;
import com.utils.csc.cscutils.view.dialog.CscDialogLoading;
import com.utils.csc.cscutils.view.dialog.CscDialogSure;
import com.utils.csc.cscutils.view.dialog.CscDialogSureCancel;

import butterknife.OnClick;

public class CscDialogActivity extends BaseActivity {

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_csc_dialog;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.transparentDialog,
            R.id.sureDialog,
            R.id.sureCancelDialog,
            R.id.loadingDialog})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.transparentDialog:
                CscDialog dialog=new CscDialog(this,R.style.tran_dialog);
                dialog.show();
                break;
            case R.id.loadingDialog:
                CscDialogLoading dialogLoading=new CscDialogLoading(this);
                dialogLoading.show();
                break;
            case R.id.sureDialog:
                final CscDialogSure dialogSure=new CscDialogSure(this);
                dialogSure.setContent("我是内容");
                dialogSure.setTitle("我是标题");
                dialogSure.setSureListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogSure.cancel();
                    }
                });
                dialogSure.show();
                break;
            case R.id.sureCancelDialog:
                final CscDialogSureCancel dialogSureCancel=new CscDialogSureCancel(this);
                dialogSureCancel.setContent("我是内容");
                dialogSureCancel.setTitle("我是标题");
                dialogSureCancel.setSureListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogSureCancel.cancel();
                    }
                });
                dialogSureCancel.setCancelListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogSureCancel.cancel();
                    }
                });
                dialogSureCancel.show();
                break;
        }

    }
}

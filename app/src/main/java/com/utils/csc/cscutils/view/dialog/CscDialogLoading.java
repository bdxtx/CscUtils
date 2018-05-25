package com.utils.csc.cscutils.view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;

import com.utils.csc.cscutils.R;

/**
 * 作者：陈思村 on 2018/5/24.
 * 邮箱：chensicun@51ganjie.com
 */
public class CscDialogLoading extends Dialog {
    public CscDialogLoading(@NonNull Context context) {
        super(context);
        initView(context);
    }
    private void initView(Context context) {
        this.getWindow().setBackgroundDrawableResource(R.drawable.transparent_bg);//设置dialog的背景为透明背景
        View view= LayoutInflater.from(context).inflate(R.layout.dialog_loading_box,null);
        setContentView(view);
    }
}

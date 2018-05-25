package com.utils.csc.cscutils.view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.utils.csc.cscutils.R;

/**
 * 作者：陈思村 on 2018/5/24.
 * 邮箱：chensicun@51ganjie.com
 */
public class CscDialogSureCancel extends Dialog {

    private TextView tv_title;
    private TextView tv_content;
    private TextView sure;
    private TextView cancel;

    public CscDialogSureCancel(@NonNull Context context) {
        super(context);
        initView(context);
    }
    private void initView(Context context){
        this.getWindow().setBackgroundDrawableResource(R.drawable.transparent_bg);//设置dialog的背景为透明背景
        View view= LayoutInflater.from(context).inflate(R.layout.dialog_sure_cancel,null);
        tv_title = view.findViewById(R.id.title);
        tv_content = view.findViewById(R.id.content);
        sure = view.findViewById(R.id.sure);
        cancel = view.findViewById(R.id.cancel);
        setContentView(view);
    }
    public void setTitle(String title){
        tv_title.setText(title);
    }
    public void setContent(String content){
        tv_content.setText(content);
    }
    public void setSureListener(View.OnClickListener listener){
        sure.setOnClickListener(listener);
    }
    public void setCancelListener(View.OnClickListener listener){
        cancel.setOnClickListener(listener);
    }
}

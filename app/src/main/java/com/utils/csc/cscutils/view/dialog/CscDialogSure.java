package com.utils.csc.cscutils.view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.utils.csc.cscutils.R;

/**
 * 作者：陈思村 on 2018/5/23.
 * 邮箱：chensicun@51ganjie.com
 */
public class CscDialogSure extends Dialog {

    private TextView tv_title;
    private TextView tv_content;
    private TextView sure;

    public CscDialogSure(@NonNull Context context) {
        super(context);
        initView(context);
    }

    public CscDialogSure(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        initView(context);
    }

    protected CscDialogSure(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        initView(context);
    }
    private void initView(Context context){
        this.getWindow().setBackgroundDrawableResource(R.drawable.transparent_bg);//设置dialog的背景为透明背景
        View view=LayoutInflater.from(context).inflate(R.layout.dialog_sure,null);
        tv_title = view.findViewById(R.id.title);
        tv_content = view.findViewById(R.id.content);
        sure = view.findViewById(R.id.sure);
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
}

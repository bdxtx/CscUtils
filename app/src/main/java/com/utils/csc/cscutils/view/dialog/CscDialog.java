package com.utils.csc.cscutils.view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.utils.csc.cscutils.R;

/**
 * 作者：陈思村 on 2018/5/22.
 * 邮箱：chensicun@51ganjie.com
 * 透明加载dialog,透明的关键是在style里面
 */
public class CscDialog extends Dialog {
    protected Context mContext;
    protected WindowManager.LayoutParams mLayoutParams;

    public CscDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        initView(context);
    }
    private void initView(Context context) {
        View view=LayoutInflater.from(context).inflate(R.layout.dialog_loading,null);
        setContentView(view);
    }
}

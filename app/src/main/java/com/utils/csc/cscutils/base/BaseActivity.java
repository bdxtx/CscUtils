package com.utils.csc.cscutils.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wenming.library.save.imp.LogWriter;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity {
    private String TAG=Constant.BASE_TAG;
    private Unbinder unbinder;

    /**
     * 这么封装是为了不用在每一个activity中写ButterKnife.bind(this);
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutRes());
        unbinder = ButterKnife.bind(this);
        initView();
        initData();
        ActivityCollector.addActivity(this);
        LogWriter.writeLog(TAG, getClass().getSimpleName()+" onCreate");
    }
    /**
     * 返回布局文件
     * @return
     */
    protected abstract int getLayoutRes();
    /**
     * 初始化控件
     */
    protected abstract void initView();
    /**
     * 初始化本界面中要用到的数据
     */
    protected abstract void initData();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
        unbinder.unbind();
        LogWriter.writeLog(TAG, getClass().getSimpleName()+" onDestroy");
    }
}

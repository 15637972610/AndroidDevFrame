package com.dkp.shopping.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dkp.shopping.R;
import com.elvishew.xlog.XLog;

/**
 * Created by dkp on 2018/12/3.
 */

public class SecondFragment extends BaseFragment {
    private static final String TAG ="SecondFragment" ;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    void initData() {
        XLog.d(TAG,"initdata");
    }

    @Override
    void initView() {
        XLog.d(TAG,"initView");
    }

    @Override
    View getCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second,container,false);
    }
}

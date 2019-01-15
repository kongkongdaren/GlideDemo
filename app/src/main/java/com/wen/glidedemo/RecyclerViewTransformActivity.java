package com.wen.glidedemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wen.adapter.RecyclerViewTransformAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewTransformActivity extends Activity {
    @BindView(R.id.rlv_transform_recyclerView)
    public RecyclerView mTransformRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_transform);
        ButterKnife.bind(this);
        //初始化RecyclerView
        RecyclerViewTransformAdapter adapter=new RecyclerViewTransformAdapter(this);
        mTransformRecyclerView.setAdapter(adapter);
        mTransformRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}

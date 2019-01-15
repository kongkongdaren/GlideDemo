package com.wen.glidedemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


import java.io.File;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {
   @BindView(R.id.iv_photo)
   public ImageView mIvPhoto;
    RequestOptions options = new RequestOptions()
            .centerCrop()
            .placeholder(R.mipmap.ic_launcher)
            .error(R.mipmap.ic_launcher);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    /**
     * 加载网络图片
     * @param view
     */
    @OnClick(R.id.btn_network)
    public void netWorkPhoto(View view){
        Glide.with(this)
                .load("http://img1.imgtn.bdimg.com/it/u=2615772929,948758168&fm=21&gp=0.jpg")
                .apply(options)
                .into(mIvPhoto);
    }

    /**
     * 加载本地图片
     * @param view
     */
    @OnClick(R.id.btn_SD)
    public void SDPhoto(View view){
        String path = Environment.getExternalStorageDirectory()+"/zshz/yule/ktv/xgn.jpg";
        File file = new File(path);
        Uri uri = Uri.fromFile(file);
        Glide.with(this)
                .load(uri)
                .apply(options)
                .into(mIvPhoto);
    }

    /**
     * 加载资源图片
     * @param view
     */
    @OnClick(R.id.btn_local)
    public void localPhoto(View view){
       Glide.with(this)
               .load(R.drawable.tupian)
               .apply(options)
               .into(mIvPhoto);
    }
    /**
     * 加载网络gif动图
     * @param view
     */
    @OnClick(R.id.btn_gif)
    public void gifPhoto(View view){
        Glide.with(this)
                .load("http://img.mp.itc.cn/upload/20161115/6163765431c44d538b37d6efb32ee885_th.jpg")
                .apply(options)
                .into(mIvPhoto);
    }
    /**
     * 加载网络gif动图
     * @param view
     */
    @OnClick(R.id.btn_local_gif)
    public void localGifPhoto(View view){
        Glide.with(this)
                .load(R.drawable.gif)
                .apply(options)
                .into(mIvPhoto);
    }
    /**
     * 设置缩略图比例
     * @param view
     */
    @OnClick(R.id.btn_thumbnail)
    public void thumbnailPhoto(View view){
        Glide.with(this)
                .load(R.drawable.tupian)
                .thumbnail(0.1f)
                .apply(options)
                .into(mIvPhoto);
    }
    /**
     * 跳转到RecyclerView
     * @param view
     */
    @OnClick(R.id.btn_recyclerView)
    public void intentRecyclerView (View view){
        startActivity(new Intent(MainActivity.this,RecyclerViewActivity.class));
    }
    /**
     * 跳转到变换RecyclerView
     * @param view
     */
    @OnClick(R.id.btn_recyclerView_different)
    public void intentTransformRecyclerView (View view){
        startActivity(new Intent(MainActivity.this,RecyclerViewTransformActivity.class));
    }


}

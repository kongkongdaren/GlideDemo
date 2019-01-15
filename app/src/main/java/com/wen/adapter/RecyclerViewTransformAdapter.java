package com.wen.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.wen.glidedemo.R;
import com.wen.utils.Utils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.ColorFilterTransformation;
import jp.wasabeef.glide.transformations.CropCircleTransformation;
import jp.wasabeef.glide.transformations.CropSquareTransformation;
import jp.wasabeef.glide.transformations.CropTransformation;
import jp.wasabeef.glide.transformations.GrayscaleTransformation;
import jp.wasabeef.glide.transformations.MaskTransformation;
import jp.wasabeef.glide.transformations.RoundedCornersTransformation;
import jp.wasabeef.glide.transformations.gpu.BrightnessFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.ContrastFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.InvertFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.KuwaharaFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.PixelationFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.SepiaFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.SketchFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.SwirlFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.ToonFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.VignetteFilterTransformation;

/**
 * Description：变换adapter <br/>
 * Copyright (c) 2019{<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2019-01-03
 *
 * @author jwj
 * @version : 1.0
 */
public class RecyclerViewTransformAdapter extends RecyclerView.Adapter<RecyclerViewTransformAdapter.ViewHolder> {
    private Context mContext;
    private List<String> mData = new ArrayList<>();
    public RecyclerViewTransformAdapter(Context context) {
        mContext=context;
        for (int i=0;i<=21;i++){
            mData.add(i+"");
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(mContext, R.layout.adapter_transform_item, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // 设置名称
        holder.mTvName.setText("item" + (position + 1));
        int integer = Integer.parseInt(mData.get(position));
        switch (integer) {
            case 1:
                int width1 = Utils.dip2px(mContext, 133.33f);
                int height1 = Utils.dip2px(mContext, 126.33f);
                Glide.with(mContext)
                        .load(R.drawable.tupian)
                        .apply(new RequestOptions().override(width1, height1)
                                .bitmapTransform(new MaskTransformation(R.drawable.mask_starfish)))
                        .into(holder.mIvTransformPhoto);
                break;

            case 2:
                int width = Utils.dip2px(mContext, 150.0f);
                int height = Utils.dip2px(mContext, 100.0f);
                Glide.with(mContext)
                        .load(R.drawable.tupian)
                        .apply(new RequestOptions().centerCrop() .override(width, height).bitmapTransform(
                                new MaskTransformation(R.drawable.mask_chat_right)))
                        .into(holder.mIvTransformPhoto);
                break;

            case 3:
                Glide.with(mContext)
                        .load(R.drawable.tan)
                        .apply(new RequestOptions().bitmapTransform(
                                new CropTransformation( 300, 100, CropTransformation.CropType.TOP)))
                        .into(holder.mIvTransformPhoto);
                break;
            case 4:
                Glide.with(mContext)
                        .load(R.drawable.tan)
                        .apply(new RequestOptions().bitmapTransform(new CropTransformation(300, 100)))
                        .into(holder.mIvTransformPhoto);
                break;
            case 5:
                Glide.with(mContext)
                        .load(R.drawable.tupian)
                        .apply(new RequestOptions() .bitmapTransform(
                                new CropTransformation( 300, 100, CropTransformation.CropType.BOTTOM)))

                        .into(holder.mIvTransformPhoto);

                break;
            case 6:
                Glide.with(mContext)
                        .load(R.drawable.tupian)
                        .apply(new RequestOptions().bitmapTransform(new CropSquareTransformation()))
                        .into(holder.mIvTransformPhoto);
                break;
            case 7:
                Glide.with(mContext)
                        .load(R.drawable.tupian)
                        .apply(new RequestOptions().bitmapTransform(new CropCircleTransformation()))
                        .into(holder.mIvTransformPhoto);
                break;
            case 8:
                Glide.with(mContext)
                        .load(R.drawable.tupian)
                        .apply(new RequestOptions().bitmapTransform(new ColorFilterTransformation( Color.argb(80, 255, 0, 0))))
                        .into(holder.mIvTransformPhoto);
                break;
            case 9:
                Glide.with(mContext)
                        .load(R.drawable.tupian)
                        .apply(new RequestOptions().bitmapTransform(new GrayscaleTransformation()))
                        .into(holder.mIvTransformPhoto);
                break;
            case 10:
                Glide.with(mContext)
                        .load(R.drawable.tupian)
                        .apply(new RequestOptions() .bitmapTransform(new RoundedCornersTransformation(30, 0,
                                RoundedCornersTransformation.CornerType.BOTTOM)))
                        .into(holder.mIvTransformPhoto);
                break;
            case 11:
                Glide.with(mContext)
                        .load(R.drawable.tupian)
                        .apply(new RequestOptions().bitmapTransform(new BlurTransformation(25)))
                        .into(holder.mIvTransformPhoto);
                break;
            case 12:
                Glide.with(mContext)
                        .load(R.drawable.tupian)
                        .apply(new RequestOptions().bitmapTransform(new ToonFilterTransformation()))
                        .into(holder.mIvTransformPhoto);
                break;
            case 13:
                Glide.with(mContext)
                        .load(R.drawable.tupian)
                        .apply(new RequestOptions().bitmapTransform(new SepiaFilterTransformation()))
                        .into(holder.mIvTransformPhoto);
                break;
            case 14:
                Glide.with(mContext)
                        .load(R.drawable.tan)
                        .apply(new RequestOptions().bitmapTransform(new ContrastFilterTransformation(2.0f)))
                        .into(holder.mIvTransformPhoto);
                break;
            case 15:
                Glide.with(mContext)
                        .load(R.drawable.tan)
                        .apply(new RequestOptions().bitmapTransform(new InvertFilterTransformation()))
                        .into(holder.mIvTransformPhoto);
                break;
            case 16:
                Glide.with(mContext)
                        .load(R.drawable.tupian)
                        .apply(new RequestOptions(). bitmapTransform(new PixelationFilterTransformation( 20)))
                        .into(holder.mIvTransformPhoto);
                break;
            case 17:
                Glide.with(mContext)
                        .load(R.drawable.tupian)
                        .apply(new RequestOptions().bitmapTransform(new SketchFilterTransformation()))
                        .into(holder.mIvTransformPhoto);
                break;
            case 18:
                Glide.with(mContext)
                        .load(R.drawable.tupian)
                        .apply(new RequestOptions().bitmapTransform( new SwirlFilterTransformation(0.5f, 1.0f, new PointF(0.5f, 0.5f))))
                        .into(holder.mIvTransformPhoto);
                break;
            case 19:
                Glide.with(mContext)
                        .load(R.drawable.tupian)
                        .apply(new RequestOptions(). bitmapTransform(new BrightnessFilterTransformation(0.5f)))
                        .into(holder.mIvTransformPhoto);
                break;
            case 20:
                Glide.with(mContext)
                        .load(R.drawable.tan)
                        .apply(new RequestOptions().bitmapTransform(new KuwaharaFilterTransformation( 25)))
                        .into(holder.mIvTransformPhoto);
                break;
            case 21:
                Glide.with(mContext)
                        .load(R.drawable.tan)
                        .apply(new RequestOptions().bitmapTransform(new VignetteFilterTransformation( new PointF(0.5f, 0.5f),
                        new float[]{0.0f, 0.0f, 0.0f}, 0f, 0.75f)))
                        .into(holder.mIvTransformPhoto);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_name)
        public TextView mTvName;
        @BindView(R.id.iv_adapter_photo)
        public ImageView mIvTransformPhoto;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}

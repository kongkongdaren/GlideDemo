package com.wen.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.wen.glidedemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Description：适配器 <br/>
 * Copyright (c) 2019{<br/>
 * This program is protected by copyright laws <br/>
 * Date: 2019-01-03
 *
 * @author jwj
 * @version : 1.0
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context mContext;


    /**
     * 准备数据
     */
    String[] mDatas = new String[]{
            "http://b337.photo.store.qq.com/psb?/V10FcMmY1Ttz2o/7.fo01qLQ*SI59*E2Wq.j82HuPfes*efgiyEi7mrJdk!/b/dLHI5cioAQAA&bo=VQOAAgAAAAABB*Q!&rf=viewer_4",
            "http://b118.photo.store.qq.com/psb?/V10FcMmY2gHuOI/8*6eK6PHCNTx1utXooId*KAWgwPTllj.b6uBg4McCwM!/b/dAt8W0YJJAAA&bo=VQOAAgAAAAABB*Q!&rf=viewer_4",
            "http://t2.hddhhn.com/uploads/tu/201901/30/1.jpg",
            "http://t2.hddhhn.com/uploads/tu/201812/678/1.jpg",
            "http://t2.hddhhn.com/uploads/tu/201812/669/1.jpg",
            "http://a.hiphotos.baidu.com/image/h%3D200/sign=d20242020e24ab18ff16e63705fae69a/267f9e2f070828389f547b30bf99a9014c08f1bd.jpg",
            "http://img5.duitang.com/uploads/item/201406/28/20140628132554_UNE4n.thumb.700_0.jpeg",
            "http://cdn.duitang.com/uploads/item/201309/22/20130922202150_ntvAB.thumb.600_0.jpeg",
            "http://cdn.duitang.com/uploads/item/201208/04/20120804013554_yRGfe.jpeg",
            "http://t2.hddhhn.com/uploads/tu/201812/538/1.jpg",
            "http://img3.duitang.com/uploads/item/201501/23/20150123204322_N8nw5.jpeg",
            "http://img4q.duitang.com/uploads/item/201505/09/20150509204813_nEwxF.jpeg",
            "http://t2.hddhhn.com/uploads/tu/201310/256/1.jpg",
            "http://i.imgur.com/syELajx.jpg",
            "http://i.imgur.com/COzBnru.jpg",
            "http://t2.hddhhn.com/uploads/tu/201503/764/1.jpg"
    };
    public RecyclerViewAdapter(Context context) {
        mContext=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(mContext, R.layout.adapter_item, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // 显示数据
        int width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, mContext.getResources().getDisplayMetrics());
        int height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200f, mContext.getResources().getDisplayMetrics());
        RequestOptions options = new RequestOptions()
                .centerCrop()
                .fitCenter()
                .override(width,height)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher);
        Glide.with(mContext)
                .load(mDatas[position])
                .apply(options)
                .into(holder.mIvAdapterPhoto);
    }

    @Override
    public int getItemCount() {
        return mDatas.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_adapter_photo)
        public ImageView mIvAdapterPhoto;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}

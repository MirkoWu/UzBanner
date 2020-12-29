package com.yoozoo.banner;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

import com.zhpan.bannerview.BaseBannerAdapter;
import com.zhpan.bannerview.BaseViewHolder;

public class BannerAdapter extends BaseBannerAdapter<String> {
    @Override
    protected void bindData(BaseViewHolder<String> holder, String data, int position, int pageSize) {
        ImageView imageView=holder.findViewById(R.id.mIvBanner);
        Glide.with(imageView.getContext())
                .load(data)
//                .apply(RequestOptions.bitmapTransform(new RoundedCorners(30)))
                .into(imageView);
    }

    @Override
    public int getLayoutId(int viewType) {
        return R.layout.item_nanner;
    }
}

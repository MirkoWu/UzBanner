package com.yoozoo.banner;


import android.os.Build;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.viewpager2.widget.ViewPager2;

import com.zhpan.indicator.utils.IndicatorUtils;


/**
 * 缩放、渐变、层级 等效果
 * ViewPager 的变换效果一般只需考虑在Transformer中做处理，单独处理或叠加均可
 */
@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class UzOverlapPageTransformer implements ViewPager2.PageTransformer {
    private int orientation;//默认横向
    private float minScale = 0f;
    private float unSelectedItemRotation = 0f;
    private float unSelectedItemAlpha = 0.9f;//in 0f..1f
    private float itemGap = 0f;
    private float scalingValue = 0.15f;//in 0f..1f
    private float translationXOffset = 60;//页面间的偏移值，可根据需要做调整，越大越紧凑


    @Override
    public void transformPage(@NonNull View page, float position) {

        page.setElevation(-Math.abs(position));


        float delta = Math.max(1f - Math.abs(position * (1 - 0.5f)), 0.5f);

        if (unSelectedItemRotation != 0f) {
            float rotation = (1 - delta) * position > 0 ? unSelectedItemRotation : -unSelectedItemRotation;

            page.setRotationY(rotation);
        }

        float scaleDelta = Math.abs(position * scalingValue);
        float scale = Math.max(1f - scaleDelta, minScale);

        page.setScaleX(scale);
        page.setScaleY(scale);

        float dp2px = IndicatorUtils.dp2px((itemGap / 2));
        switch (orientation) {
            case ViewPager2.ORIENTATION_HORIZONTAL:
                float translationX = position * dp2px + position > 0 ? (-page.getWidth() * (1f - scale)) : (page.getWidth() * (1f - scale));
                page.setTranslationX(translationX - Math.abs(position) * position * translationXOffset);//调整间距

                break;
            case ViewPager2.ORIENTATION_VERTICAL:
                float translationY = position * dp2px + position > 0 ? (-page.getWidth() * (1f - scale)) : (page.getWidth() * (1f - scale));
                page.setTranslationY(translationY);

            default:
                throw new IllegalArgumentException("Gives correct orientation value, ViewPager2.ORIENTATION_HORIZONTAL or ViewPager2.ORIENTATION_VERTICAL");

        }
        if (unSelectedItemAlpha != 1f) {
//            float alpha = (position >= -1f && position <= 1f) ? (0.5f + ((1 - Math.abs(position)) * 0.5f)) : (0.5f / Math.abs(/*position **/ position));
            float alpha = (position >= -1f && position <= 1f) ? (unSelectedItemAlpha + ((1 - Math.abs(position)) * 0.5f)) : (unSelectedItemAlpha / Math.abs(/*position **/ position));
            if (position < -2.2|| position > 2.7 ) alpha = 0f;//隐藏底层page 做渐变效果  这个值也可以自己把控
            page.setAlpha(alpha);
        }
    }


}
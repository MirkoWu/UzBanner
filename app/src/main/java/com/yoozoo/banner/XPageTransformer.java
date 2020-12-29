//package com.yoozoo.banner;
//
//import android.content.Context;
//import android.util.Log;
//import android.view.View;
//
//import androidx.annotation.NonNull;
//
//import com.youth.banner.transformer.BasePageTransformer;
//import com.youth.banner.util.BannerUtils;
//
//public class XPageTransformer extends BasePageTransformer {
//    public static final float SCALE_1 = 0.75f;
//    public static final float SCALE_2 = 0.5f;
//    public static final float SCALE_3 = 0.25f;
//    public static final float SIDE_CENTER=0.25f;
//    //    private float mMinScale=SCALE_1;
//    @Override
//    public void transformPage(@NonNull View page, float position) {
//
////        page.setAlpha(0.2f);
////        page.setTranslationX((-page.getWidth() * position *0.5f));
//        //设置每个View在中间，即设置相对原位置偏移量
//        Context context = page.getContext();
//        int pageWidth = page.getWidth();
//        int pageHeight = page.getHeight();
//
//
//        Log.e("onTransform", "position ==>" + position + "   pageWidth ==>" + pageWidth);
//
////        page.setPivotY(pageHeight / 2f);
////        page.setPivotX(pageWidth / 2f);
//
//        if (position < -2) {
////            page.setScaleX(SCALE_3);
////            page.setScaleY(SCALE_3);
////            page.setPivotX(pageWidth);
//
//
//        } else if (position < -1) {//边[-2,-1]
////            float offsetX =  -page.getWidth()* position*((2+position)*(SCALE_2-SCALE_3) +SCALE_3);
//            float offsetX = -page.getWidth() * position * SCALE_2;
//            page.setTranslationX(offsetX);
//
//
////            float scaleFactor = (2+position)*(SCALE_2-SCALE_3) +SCALE_3;
////            Log.e("onTransform", "[-2,-1] scaleFactor ==>" + scaleFactor);
////            page.setScaleX(scaleFactor);
////            page.setScaleY(scaleFactor);
////            page.setPivotX(pageWidth * (SIDE_CENTER + (SIDE_CENTER * -position)));
//
////            }
//        } else if (position <= 1) {//1
////            page.setTranslationX(( -page.getWidth() * position*0.5f ));//不动 在最中心
////            page.setTranslationX(( -page.getWidth() * position ));//不动 在最中心
//            if (position < 0) {//[-1,0]
////                float scaleFactor = (1 + position) * (1 - SCALE_2) + SCALE_2;
////                Log.e("onTransform", "[-1,0] scaleFactor ==>" + scaleFactor);
////                page.setScaleX(scaleFactor);
////                page.setScaleY(scaleFactor);
////                page.setPivotX(pageWidth * (DEFAULT_CENTER + (DEFAULT_CENTER * -position)));
//
//
//                float offsetX = -page.getWidth() * position * SCALE_2;
//                page.setTranslationX(offsetX);
//            } else {//[0,1]
////                if(position==0) page.bringToFront();
//
////                float scaleFactor = (1 - position) * (1 - SCALE_2) + SCALE_2;
////                Log.e("onTransform", "[0,1] scaleFactor ==>" + scaleFactor);
////                page.setScaleX(scaleFactor);
////                page.setScaleY(scaleFactor);
////                page.setPivotX(pageWidth * ((1 - position) * DEFAULT_CENTER));
//
//
//                float offsetX = -page.getWidth() * position * SCALE_2;
//                page.setTranslationX(offsetX);
//
//
//
//            }
//
//        } else if (position < 2) {//[1,2]
////            float scaleFactor = (2 - position) * (SCALE_2 - SCALE_3) + SCALE_3;
////            Log.e("onTransform", "[1,2] scaleFactor ==>" + scaleFactor);
////            page.setScaleX(scaleFactor);
////            page.setScaleY(scaleFactor);
//////            page.setPivotX(pageWidth * (SIDE_CENTER + (SIDE_CENTER * -position)));
////            page.setPivotX(pageWidth * ((1 - position) * SIDE_CENTER));
//
//
//            float offsetX = -page.getWidth() * position * ((2 - position) * (SCALE_2 - SCALE_3) + SCALE_3);
////            float offsetX = -page.getWidth() * position * SCALE_2;
//            page.setTranslationX(offsetX);
//        } else {//[2,+]
//            //  page.setTranslationX(-page.getWidth());
//            page.setScaleX(SCALE_3);
//            page.setScaleY(SCALE_3);
//            page.setPivotX(0);
//        }
//
////        page.setTranslationX((-page.getWidth() * position *0.5f));
//
////        if(position==0){//当前的
////            page.setAlpha(1.0f);
////        } else if(position<=-2.0f ||position>=2.0f){//最边边的
////            page.setAlpha(0.45f);
////
////            page.setScaleX(SCALE_1);
////            page.setScaleY(SCALE_1);
////            page.setPivotX(pageWidth);
////
////        }else  if(position<=-1.0f ||position>=1.0f){//左右二边的
////            page.setAlpha(0.75f);
////
////            if(position<)
////
////            float scaleFactor = (1 + position) * (1 - mMinScale) + mMinScale;
////
////            page.setScaleX(SCALE_2);
////            page.setScaleY(SCALE_2);
////            page.setPivotX(pageWidth);
////        }else  {//其余不可见的
////            page.setAlpha(0f);
////
////            page.setScaleX(SCALE_2);
////            page.setScaleY(SCALE_2);
////            page.setPivotX(pageWidth);
////        }
//
//
////        if (position <= 0.0f) {
////            //最上面的卡片可以点击
////            page.setClickable(true);
////
////            page.setAlpha(1.0f);
////            //出现卡片抽动效果的关键代码
////            page.setTranslationX(0f);
////        } else {
////            ////控制显示几张卡片
////            // } else if(position <= 3.0f) {
////
////            //下面的卡片不可点击
////            page.setClickable(false);
////
////            float scale = (float) (page.getWidth() - BannerUtils.dp2px(  20 * position)) / (float) (page.getWidth());
////            page.setAlpha(1.0f);
////            page.setPivotX(page.getWidth() / 2f);
////            page.setPivotY(page.getHeight() / 2f);
////            page.setScaleX(scale);
////            page.setScaleY(scale);
////            //修改过的代码
////            page.setTranslationX(-page.getHeight() * position + (page.getHeight() * 0.5f) * (1 - scale) + BannerUtils.dp2px(  10) * position);
////        }
//
//
////        if (position < -1) { // [-Infinity,-1)
////            // This page is way off-screen to the left.
////            page.setScaleX(mMinScale);
////            page.setScaleY(mMinScale);
////            page.setPivotX(pageWidth);
////        } else if (position <= 1) { // [-1,1]
////            // Modify the default slide transition to shrink the page as well
////            if (position < 0) //1-2:1[0,-1] ;2-1:1[-1,0]
////            {
////
////                float scaleFactor = (1 + position) * (1 - mMinScale) + mMinScale;
////                page.setScaleX(scaleFactor);
////                page.setScaleY(scaleFactor);
////
////                page.setPivotX(pageWidth * (DEFAULT_CENTER + (DEFAULT_CENTER * -position)));
////
////            } else //1-2:2[1,0] ;2-1:2[0,1]
////            {
////                float scaleFactor = (1 - position) * (1 - mMinScale) + mMinScale;
////                page.setScaleX(scaleFactor);
////                page.setScaleY(scaleFactor);
////                page.setPivotX(pageWidth * ((1 - position) * DEFAULT_CENTER));
////            }
////
////
////        } else { // (1,+Infinity]
////            page.setPivotX(0);
////            page.setScaleX(mMinScale);
////            page.setScaleY(mMinScale);
////        }
////        if (position < -2) { // [-Infinity,-2)
////            // This page is way off-screen to the left.
////            page.setScaleX(SCALE_3);
////            page.setScaleY(SCALE_3);
////            page.setPivotX(pageWidth);
////
//////            page.setTranslationX((-page.getWidth() * position *0.25f));
////        } else if (position <= 2) { // [-2,2]
////            // Modify the default slide transition to shrink the page as well
//////            if(position<-1){//[-2,-1]
//////                float scaleFactor = (2 + position) * (1 - SCALE_2) + SCALE_2;
//////                page.setScaleX(scaleFactor);
//////                page.setScaleY(scaleFactor);
//////
//////                page.setPivotX(pageWidth * (DEFAULT_CENTER + (DEFAULT_CENTER * -position)));
//////
//////
//////            } else if(position<=0){//[-1,0]
////////                float scaleFactor = (1 + position) * (1 - SCALE_1) + SCALE_1;
////////                page.setScaleX(scaleFactor);
////////                page.setScaleY(scaleFactor);
////////
////////                page.setPivotX(pageWidth * (DEFAULT_CENTER + (DEFAULT_CENTER * -position)));
//////            }else if(position<1){//[0,1]
////////                float scaleFactor = (1 - position) * (1 - SCALE_1) + SCALE_1;
////////                page.setScaleX(scaleFactor);
////////                page.setScaleY(scaleFactor);
////////                page.setPivotX(pageWidth * ((1 - position) * DEFAULT_CENTER));
//////            }else {//[1,2]
//////                float scaleFactor = (2 - position) * (1 - SCALE_2) + SCALE_2;
//////                page.setScaleX(scaleFactor);
//////                page.setScaleY(scaleFactor);
//////                page.setPivotX(pageWidth * ((2 - position) * DEFAULT_CENTER));
//////            }
////
//////            if (position < 0) //1-2:1[0,-1] ;2-1:1[-1,0]
//////            {
//////
//////                float scaleFactor = (1 + position) * (1 - mMinScale) + mMinScale;
//////                page.setScaleX(scaleFactor);
//////                page.setScaleY(scaleFactor);
//////
//////                page.setPivotX(pageWidth * (DEFAULT_CENTER + (DEFAULT_CENTER * -position)));
//////
//////            } else //1-2:2[1,0] ;2-1:2[0,1]
//////            {
//////                float scaleFactor = (1 - position) * (1 - mMinScale) + mMinScale;
//////                page.setScaleX(scaleFactor);
//////                page.setScaleY(scaleFactor);
//////                page.setPivotX(pageWidth * ((1 - position) * DEFAULT_CENTER));
//////            }
////
////
////        } else { // (2,+Infinity]
////            page.setPivotX(0);
////            page.setScaleX(SCALE_3);
////            page.setScaleY(SCALE_3);
////
//////            page.setTranslationX((-page.getWidth() * position *0.25f));
////        }
//
//    }
//}

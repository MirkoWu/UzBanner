package com.yoozoo.banner;

import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public class ViewPagerUtils {
    /**
     *设置可见数量
     * @param viewGroup
     * @param itemCount
     */
    public static void setRecyclerViewVisibleItemCount(final ViewGroup viewGroup, final int itemCount) {
        ViewPager2 viewPager2 = (ViewPager2) viewGroup.getChildAt(0);
        if (viewPager2 != null) {
            final RecyclerView recyclerView = (RecyclerView) viewPager2.getChildAt(0);
            viewGroup.post(new Runnable() {
                @Override
                public void run() {
                    int itemWidth = (int) (1f * viewGroup.getMeasuredWidth() / (itemCount - 2));//考虑到缩放和间距问题，减少二个
                    int padding = itemWidth;
                    recyclerView.setPadding(padding, 0, padding, 0);
                    recyclerView.setClipToPadding(false);
                }
            });
        }
    }
}

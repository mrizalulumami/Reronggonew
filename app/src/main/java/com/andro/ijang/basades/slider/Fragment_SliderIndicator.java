package com.andro.ijang.basades.slider;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.widget.LinearLayout;

public class Fragment_SliderIndicator  implements ViewPager.OnPageChangeListener {
    private Context mContext;
    private LinearLayout mContainer;
    private int mDrawable;
    private int mSpacing;
    private int mSize;
    private  ViewPager mViewPager;
    private int mPageCount;
    private int mInitialPage=0;
    private  int defaultSizeInDp=12;
    private  int defaultSpacingInDp=12;

    public Fragment_SliderIndicator(@NonNull Context context,
                                    @NonNull LinearLayout containerView,
                                    @NonNull ViewPager viewPager,
                                    @DrawableRes int drawableRes) {
        if (context == null){
            throw  new IllegalArgumentException("context cannot be null!");
        }else  if (containerView == null){
            throw  new IllegalArgumentException("containerView cannot be null!");
        }else  if (viewPager == null){
            throw  new IllegalArgumentException("viewPager cannot be null!");
        }else  if (viewPager.getAdapter() == null){
            throw  new IllegalArgumentException("viewPager does not have an adapter set on it!");
        }

        mContext = context;
        mContainer = containerView;
        mDrawable = drawableRes;
        mViewPager= viewPager;
    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int i) {

    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }
}

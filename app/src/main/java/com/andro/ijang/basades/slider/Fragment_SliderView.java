package com.andro.ijang.basades.slider;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.Scroller;

import java.lang.reflect.Field;

public class Fragment_SliderView extends  ViewPager{
    public  static  final  int DEFAULT_SCROL_DURATION = 200;

    public  Fragment_SliderView(Context context){
        super(context);
        init();
    }
    public  Fragment_SliderView(Context context, AttributeSet attrs){
        super(context,attrs);
        init();
    }
    private  void init(){
        setDurationScroll(DEFAULT_SCROL_DURATION);
        this.setOnTouchListener((new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        }) );
    }
    public void setDurationScroll(int millis){
        try {
            Class<?> viewPager = ViewPager.class;
            Field scroller = viewPager.getDeclaredField("mScroll");
            scroller.setAccessible(true);
            scroller.set(this, new OwnScroller(getContext(), millis));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public  class OwnScroller extends Scroller{
        private int durationScrollMillis = 1;

        public  OwnScroller(Context context, int durationScroll){
            super(context,new DecelerateInterpolator());
            this.durationScrollMillis = durationScroll;
        }
        @Override
        public void startScroll(int starX,int startY,int dx ,int dy,int duration){
            super.startScroll(starX,startY,dx,dy,durationScrollMillis);
        }
    }

}

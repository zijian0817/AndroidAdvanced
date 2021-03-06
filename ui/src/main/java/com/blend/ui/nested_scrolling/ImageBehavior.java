package com.blend.ui.nested_scrolling;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import com.blend.ui.nested_scrolling.design.Behavior;


public class ImageBehavior extends Behavior {

    private int mMaxHeight = 400;
    private int mOriginHeight;

    public ImageBehavior(Context context, AttributeSet set) {
        super(context, set);
    }

    @Override
    public void onLayoutFinish(View parent, View child) {
        super.onLayoutFinish(parent, child);
        if (mOriginHeight == 0) {
            mOriginHeight = child.getHeight();
        }
    }

    @Override
    public void onNestedScroll(View scrollView, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        super.onNestedScroll(scrollView, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
        if (scrollView.getScrollY() > 0) {
            ViewGroup.LayoutParams params = target.getLayoutParams();
            params.height = params.height - Math.abs(dyConsumed);
            if (params.height < mOriginHeight) {
                params.height = mOriginHeight;
            }
            target.setLayoutParams(params);
        } else if (scrollView.getScrollY() == 0) {
            ViewGroup.LayoutParams params = target.getLayoutParams();
            params.height = params.height + Math.abs(dyUnconsumed);
            if (params.height >= mMaxHeight) {
                params.height = mMaxHeight;
            }
            target.setLayoutParams(params);
        }
    }
}

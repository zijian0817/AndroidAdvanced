package com.blend.ui.custom_view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.blend.ui.R;

/**
 * 自定义View须知：
 * 1.让View支持warp_content
 * 2.让View支持padding
 * 3.不要在View中Handle
 * 4.View中有动画或者线程，需要及时停止，可以在onDetachedFromWindow中进行
 * 5.View有滑动冲突时，解决好滑动冲突
 */
public class CustomViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);
    }
}

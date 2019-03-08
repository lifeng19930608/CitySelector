package com.rongwei.city.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

/**
 * 解决嵌套只显示一行的bug
 */

public class CityGridView extends GridView {

    public CityGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CityGridView(Context context) {
        super(context);
    }

    public CityGridView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = View.MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, View.MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

}
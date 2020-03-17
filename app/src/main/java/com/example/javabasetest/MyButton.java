package com.example.javabasetest;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;

public class MyButton extends androidx.appcompat.widget.AppCompatButton {

    private static final String TAG = "MyButton";

    public MyButton(Context context) {
        super(context);
        Log.i(TAG, "----------------------------->MyButton(Context context)");
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.i(TAG, "----------------------------->MyButton(Context context, AttributeSet attrs)");
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.i(TAG, "----------------------------->MyButton(Context context, AttributeSet attrs, int defStyleAttr)");
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.i(TAG, "----------------------------->onMeasure");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.i(TAG, "----------------------------->onLayout");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i(TAG, "----------------------------->onDraw");
    }
}

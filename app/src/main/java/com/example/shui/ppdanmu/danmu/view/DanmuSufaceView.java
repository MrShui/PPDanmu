package com.example.shui.ppdanmu.danmu.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceView;

import com.example.shui.ppdanmu.danmu.DanmuTimer;
import com.example.shui.ppdanmu.danmu.IDanmuView;

/**
 * Created by Shui on 2018/9/21.
 */
public class DanmuSufaceView extends SurfaceView implements IDanmuView {


    public DanmuSufaceView(Context context) {
        super(context);
    }

    public DanmuSufaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DanmuSufaceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void drawDanmu(Canvas canvas, DanmuTimer danmuTimer) {

    }
}

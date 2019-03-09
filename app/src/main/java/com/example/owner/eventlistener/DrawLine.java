package com.example.owner.eventlistener;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.nio.FloatBuffer;

public class DrawLine extends View {
    public DrawLine(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.TRANSPARENT);

        Paint paint = new Paint();
        //画像の枠を青色に変える
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(10);

        FloatBuffer fb = FloatBuffer.allocate(300);
        fb.put(380);
        fb.put(450);
        fb.put(380);
        fb.put(820);

        fb.put(380);
        fb.put(820);
        fb.put(700);
        fb.put(820);

        fb.put(700);
        fb.put(820);
        fb.put(700);
        fb.put(450);

        fb.put(700);
        fb.put(450);
        fb.put(380);
        fb.put(450);

    }
}

package com.example.apperikfinn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Finn extends View {

    Bitmap bitmap;
    Rect r2;


    public Finn(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        bitmap = BitmapFactory.decodeResource(
                getResources(),
                R.mipmap.finn
        );
        r2 = new Rect();
        r2.bottom = 800;
        r2.top = 150;
        r2.left = 150;
        r2.right = 400;


    }



    @Override
    protected void onDraw(Canvas canvas) {

        //canvas.drawBitmap(bitmap, 50, 50, null);
        canvas.drawBitmap(bitmap, null, r2, null);

        //canvas.drawBitmap(bitmap, r1,);
    }
}

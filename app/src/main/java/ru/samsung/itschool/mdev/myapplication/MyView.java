package ru.samsung.itschool.mdev.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint pen = new Paint();
        pen.setColor(Color.RED);
        //pen.setColor(Color.parseColor("#ccff00"));
        //pen.setColor(Color.rgb(100,100,255));
        pen.setAntiAlias(true); // сглаживание
        pen.setStrokeWidth(25);
        pen.setStyle(Paint.Style.STROKE);
        canvas.drawColor(Color.YELLOW); // Фон canvas
        canvas.drawCircle(getWidth()/2,
                getHeight()/2,300,pen);

        Path path = new Path();
        path.moveTo(600,600);
        path.lineTo(700,700);
        path.lineTo(500,600);
        pen.setStyle(Paint.Style.FILL);
        canvas.drawPath(path,pen);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
                R.drawable.football);
        canvas.drawBitmap(bitmap,0,0,pen);

        canvas.rotate(45,200,200);
        pen.setTextSize(150);
        canvas.drawText("Hello!",50,100,pen);
        canvas.rotate(-45,200,200);



    }
}

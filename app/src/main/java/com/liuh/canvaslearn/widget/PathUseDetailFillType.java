package com.liuh.canvaslearn.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by huan on 2018/3/26.
 * <p>
 * Path的setFillType(...)方法;
 * <p>
 * EVEN_ODD	奇偶规则
 * INVERSE_EVEN_ODD	反奇偶规则
 * WINDING	非零环绕数规则
 * INVERSE_WINDING	反非零环绕数规则
 * <p>
 * setFillType	设置填充规则
 * getFillType	获取当前填充规则
 * isInverseFillType	判断是否是反向(INVERSE)规则
 * toggleInverseFillType	切换填充规则(即原有规则与反向规则之间相互切换)
 * <p>
 * 此处设置填充规则好像没有用，四种规则最终效果都是一样的
 */

public class PathUseDetailFillType extends View {

    private Paint mPaint;

    private int mWidth, mHeight;

    public PathUseDetailFillType(Context context) {
        this(context, null);
    }

    public PathUseDetailFillType(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PathUseDetailFillType(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setStyle(Paint.Style.FILL);

        canvas.translate(mWidth / 2, mHeight / 2);

        Path path = new Path();

        path.setFillType(Path.FillType.EVEN_ODD);//设置Path填充模式为奇偶规则
//        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);//非奇偶规则
        path.addRect(-200, -200, 200, 200, Path.Direction.CCW);

        canvas.drawPath(path, mPaint);
    }
}

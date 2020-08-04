package space.ming.obpro;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

class Ellipse extends Circle implements ColorChangeble {

    private int radius2;
    private static Paint paint;

    public Ellipse(Point basePoint, int radius, int radius2) {
        super(basePoint, radius);
        this.radius2 = radius2;
        paint = new Paint();
        paint.setColor(Color.BLUE);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawOval(
                getBasePoint().getX(),
                getBasePoint().getY(),
                getBasePoint().getX()+getRadius2()*2,
                getBasePoint().getY()+getRadius()*2,
                paint
        );
    }

    @Override
    public void changeColor(int color) {
        paint.setColor(color);
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }
}

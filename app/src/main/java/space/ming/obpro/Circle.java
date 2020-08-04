package space.ming.obpro;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Circle extends Figure {

    private int radius;
    private static Paint paint;

    public Circle(Point basePoint, int radius) {
        super(basePoint);
        this.radius = radius;
        paint = new Paint();
        paint.setColor(Color.RED);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(
                getBasePoint().getX(),
                getBasePoint().getY(),
                radius,
                paint
        );
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
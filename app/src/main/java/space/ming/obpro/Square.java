package space.ming.obpro;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Square extends Figure implements ColorChangeble {

    private int width;
    private static Paint paint;

    public Square(Point basePoint, int width) {
        super(basePoint);
        this.width = width;
        paint = new Paint();
        paint.setColor(Color.GREEN);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRect(
                getBasePoint().getX(),
                getBasePoint().getY(),
                getBasePoint().getX()+width,
                getBasePoint().getY()+width,
                paint
        );
    }

    @Override
    public void changeColor(int color) {
        paint.setColor(color);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

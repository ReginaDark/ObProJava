package space.ming.obpro;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Rectangle extends Square {

    private int height;
    private static Paint paint;

    public Rectangle(Point basePoint, int width, int height) {
        super(basePoint, width);
        this.height = height;
        paint = new Paint();
        paint.setColor(Color.YELLOW);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRect(
                getBasePoint().getX(),
                getBasePoint().getY(),
                getBasePoint().getX()+getWidth(),
                getBasePoint().getY()+height,
                paint
        );
    }

    @Override
    public void changeColor(int color) {
        paint.setColor(color);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
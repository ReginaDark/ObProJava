package space.ming.obpro;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.Random;

public class DrawView extends View {

    private static final int STEP = 20;

    Paint p;
    public Circle[] circles;
    private Ellipse[] ellipses;
    private Rectangle[] rectangles;
    private Square[] squares;
    private Random random;

    public DrawView(Context context) {
        super(context);
        init();
    }

    private void init() {
        p = new Paint();
        random = new Random();
        circles = new Circle[]{
                new Circle(new Point(400, 400), 200),
                new Circle(new Point(400, 600), 150)
        };
        squares = new Square[]{
                new Square(new Point(400, 400), 200),
                new Square(new Point(400, 600), 120)
        };
        rectangles = new Rectangle[]{
                new Rectangle(new Point(400, 950), 100, 190),
                new Rectangle(new Point(400, 900), 80, 110)
        };
        ellipses = new Ellipse[]{
                new Ellipse(new Point(400, 500), 100, 180),
                new Ellipse(new Point(400, 800), 50, 170)
        };
    }

    public DrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DrawView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();

    }

    public DrawView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.BLACK);
        for (Circle c : circles) {
            c.draw(canvas);

        }
        for (Ellipse e : ellipses) {
            e.draw(canvas);
        }
        for (Rectangle r : rectangles) {
            r.draw(canvas);
        }
        for (Square s : squares) {
            s.draw(canvas);
        }
    }
    @Override
    public void invalidate() {
        for (Circle c : circles) {
            c.moveTo(
                    -STEP + random.nextInt(STEP*2),
                    -STEP + random.nextInt(STEP*2)
            );
        }
        for (Ellipse e : ellipses) {
            e.moveTo(-STEP + random.nextInt(STEP*2),
                    -STEP + random.nextInt(STEP*2)
            );

        }
        for (Square s : squares) {
            s.moveTo(-STEP + random.nextInt(STEP*2),
                    -STEP + random.nextInt(STEP*2)
            );

        }
        for (Rectangle r : rectangles) {
            r.moveTo(-STEP + random.nextInt(STEP*2),
                    -STEP + random.nextInt(STEP*2)
            );

        }
        super.invalidate();
    }
    public void ChangeColor1(){
        for (Rectangle r :rectangles ){
            r.changeColor(Color.WHITE);
        }
        invalidate();
    }
    public void ChangeColor2(){
        for (Ellipse e :ellipses ){
            e.changeColor(Color.CYAN);
        }
        invalidate();
    }
    public void ChangeColor3(){
        for (Square s :squares){
            s.changeColor(Color.BLUE);
        }
        invalidate();
    }

}

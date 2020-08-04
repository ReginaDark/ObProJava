package space.ming.obpro;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import space.ming.obpro.DrawView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button Change_button1;
    Button Change_button2;
    Button Change_button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DrawView drawView = findViewById(R.id.thisDrawView);
        final Handler handler = new Handler();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                drawView.invalidate();
                handler.postDelayed(this, 400);
            }
        }, 400);


        Change_button1 = (Button) findViewById(R.id.Change_button1);
        Change_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 drawView.ChangeColor1();
            }
        });

        Change_button2 = (Button) findViewById(R.id.Change_button2);
        Change_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawView.ChangeColor2();
            }
        });

        Change_button3 = (Button) findViewById(R.id.Change_button3);
        Change_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawView.ChangeColor3();
            }
        });

    }

}
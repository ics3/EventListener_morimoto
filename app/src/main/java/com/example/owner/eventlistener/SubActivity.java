package com.example.owner.eventlistener;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class SubActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            private boolean flg = true;

            @Override
            public void onClick(View v) {
                TextView textView = findViewById(R.id.push);

                //表示・非表示
                if (flg) {
                    textView.setVisibility(View.GONE);
                    flg = false;
                } else {
                    textView.setVisibility(View.VISIBLE);
                    flg = true;
                }
            }
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            private boolean flg = true;

            @Override
            public void onClick(View v) {
                ImageView imageView3 = findViewById(R.id.imageView3);

                //枠の表示・非表示
                if (flg) {
                    imageView3.setBackgroundResource(R.drawable.frame1);
                    flg = false;
                } else {
                    imageView3.setBackgroundResource(R.drawable.frame2);
                    flg = true;
                }
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        //座標表示
        TextView textView = findViewById(R.id.xy);
        textView.setText("X座標：" + x + "\r\nY座標：" + y);

        return true;
    }

}

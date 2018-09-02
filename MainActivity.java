package com.cooperationx.luca.guimanipulator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final int[] a = {1};

        final TextView tv = findViewById(R.id.tv);
        final Button main = findViewById(R.id.button_main);
        Button change = findViewById(R.id.button_change);
        final EditText edit = findViewById(R.id.edit_text);
        Button save = findViewById(R.id.button_change);
        Button delete = findViewById(R.id.button_delete);
        final Button visibility = findViewById(R.id.button_visibility);

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a[0] += 1;

                if (a[0] >= 5) {
                    a[0] = 1;


                }

                if (a[0] == 1) {

                    main.setBackgroundColor(Color.BLUE);
                    main.setText("Blau");
                } else if (a[0] == 2) {

                    main.setBackgroundColor(Color.GREEN);
                    main.setText("Grün");
                } else if (a[0] == 3) {

                    main.setBackgroundColor(Color.RED);
                    main.setText("Rot");
                } else if (a[0] == 4) {

                    main.setBackgroundColor(Color.MAGENTA);
                    main.setText("Rosa");
                }
            }
        });


        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (a[0] == 1) {

                    tv.setTextColor(Color.BLUE);
                } else if (a[0] == 2) {

                    tv.setTextColor(Color.GREEN);
                } else if (a[0] == 3) {

                    tv.setTextColor(Color.RED);
                } else if (a[0] == 4) {

                    tv.setTextColor(Color.MAGENTA);
                }
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText(tv.getText() + edit.getText().toString());
                edit.setText("");
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText("");
            }
        });

        visibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a[0] += 1;

                if (a[0] >= 3) {
                    a[0] = 1;

                }
                if (a[0] == 1) {

                    tv.setVisibility(View.INVISIBLE);
                    visibility.setText("Unsichtbar");

                } else if (a[0] == 2) {

                    tv.setVisibility(View.VISIBLE);
                    visibility.setText("Sichtbar");
                }
            }
        });
    }
}
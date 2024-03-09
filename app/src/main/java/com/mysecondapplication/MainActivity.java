package com.mysecondapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton bAdd, bCall, bTicket;
    TextView tAdd, tCall, tTicket;

    Boolean isAllVisible;

    ConstraintLayout layout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bAdd = findViewById(R.id.add_fab);
        bCall = findViewById(R.id.add_fab2);
        bTicket = findViewById(R.id.add_fab3);

        layout1 = findViewById(R.id.layout1);

        tAdd = findViewById(R.id.textView1);
        tTicket = findViewById(R.id.textView2);
        tCall = findViewById(R.id.textView3);

        bCall.setVisibility(View.GONE);
        bTicket.setVisibility(View.GONE);
        tCall.setVisibility(View.GONE);
        tTicket.setVisibility(View.GONE);

        isAllVisible = false;

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isAllVisible) {
                    bCall.show();
                    bTicket.show();

                    tCall.setVisibility(View.VISIBLE);
                    tTicket.setVisibility(View.VISIBLE);

                    isAllVisible = true;
                } else {
                    bCall.hide();
                    bTicket.hide();

                    tCall.setVisibility(View.GONE);
                    tTicket.setVisibility(View.GONE);

                    isAllVisible = false;
                }
            }
        });

        bCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Calling", Toast.LENGTH_LONG).show();
                bCall.hide();
                bTicket.hide();

                tCall.setVisibility(View.GONE);
                tTicket.setVisibility(View.GONE);
                isAllVisible = false;
            }
        });

        bTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Ticket is added", Toast.LENGTH_LONG).show();
                bCall.hide();
                bTicket.hide();

                tCall.setVisibility(View.GONE);
                tTicket.setVisibility(View.GONE);
                isAllVisible = false;
            }
        });

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bCall.hide();
                bTicket.hide();

                tCall.setVisibility(View.GONE);
                tTicket.setVisibility(View.GONE);
                isAllVisible = false;
            }
        });

    }
}
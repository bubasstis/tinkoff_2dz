package com.example.sem.tinkoff_2dz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button firstTaskBtn;
    Button secondTaskBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstTaskBtn = (Button) findViewById(R.id.first_task_btn);
        secondTaskBtn = (Button) findViewById(R.id.second_task_btn);

        firstTaskBtn.setOnClickListener(this);
        secondTaskBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {

            case R.id.first_task_btn:
                intent = new Intent(this, FirstTaskActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;

            case R.id.second_task_btn:
                intent = new Intent(this, SecondTaskActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}

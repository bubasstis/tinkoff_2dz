package com.example.sem.tinkoff_2dz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondTaskActivity2 extends AppCompatActivity implements View.OnClickListener {
    TextView nameTextView;
    Button okButton;
    Button cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_task2);

        nameTextView = (TextView) findViewById(R.id.name_text_view);
        nameTextView.setText(getIntent().getStringExtra("text"));

        okButton = (Button) findViewById(R.id.ok_button);
        okButton.setOnClickListener(this);
        cancelButton = (Button) findViewById(R.id.cancel_button);
        cancelButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.ok_button:
                setResult(RESULT_OK);
                finish();
                break;

            case R.id.cancel_button:
                setResult(RESULT_CANCELED);
                finish();
                break;

            default:
                break;
        }
    }
}

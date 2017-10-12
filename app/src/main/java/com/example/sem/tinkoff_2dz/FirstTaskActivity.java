package com.example.sem.tinkoff_2dz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstTaskActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editText;
    Button sendBtn;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_task);

        editText = (EditText) findViewById(R.id.message_edit_text);

        sendBtn = (Button) findViewById(R.id.send_btn);
        sendBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent sendIntent = new Intent();
        message = editText.getText().toString();

        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, message);
        sendIntent.setType("text/plain");

        startActivity(sendIntent);
    }
}

package com.example.sem.tinkoff_2dz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondTaskActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nameEditText;
    Button acceptButton;


    private String text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_task);

        acceptButton = (Button) findViewById(R.id.accept_btn);
        acceptButton.setOnClickListener(this);

        nameEditText = (EditText) findViewById(R.id.message_edit_name);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondTaskActivity2.class);
        text = nameEditText.getText().toString();
        intent.putExtra("text", text);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (resultCode){
            case RESULT_OK:
                makeToast("Ваш рандомный текст - "+ text );
                break;
            case RESULT_CANCELED:
                makeToast("Отмена");

        }
    }

    private void makeToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

}

package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.text);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                ((TextView)findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));


            }
        });
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.lightblue));

            }
        });
        findViewById(R.id.changetextbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView)findViewById(R.id.text)).setText("Android is Awesome");
            }
        });

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Hello from Nate! ");
                textView.setTextColor(getResources().getColor(R.color.black));
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.lightpurple));



            }
        });
        findViewById(R.id.changeCustomTestButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userText = ((EditText)findViewById(R.id.editText)).getText().toString();
                if (userText.isEmpty())
                {
                    textView.setText("Enter Your own Text");
                }
                else{
                    textView.setText(userText);
                }

            }
        });
    }
}
package ru.mirea.seyfetdinov.r.n.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.outputText);
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String value = extras.getString("key");
            textView.setText(value);
        }

    }
}
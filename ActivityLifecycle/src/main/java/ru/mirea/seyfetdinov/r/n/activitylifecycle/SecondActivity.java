package ru.mirea.seyfetdinov.r.n.activitylifecycle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @SuppressLint("MissingInflatedId")
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
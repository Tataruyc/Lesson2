package ru.mirea.seyfetdinov.r.n.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialogTime(View view) {
        String title = "Ваше время";

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss", Locale.UK);
        Date date = new Date();
        String message = String.valueOf(formatter.format(date.getTime())) + "?";

        String neutralBText = "Верно!";
        String negativeBText = "Нет";
        String positiveBText = "Хочу узнать время";

        String onNeutralClickedText = "Вы выбрали кнопку \"Хочу узнать время\"!";

        MyDialogFragment myTimeDialogFragment = new MyDialogFragment(title, message, neutralBText, negativeBText, positiveBText, onNeutralClickedText);
        myTimeDialogFragment.show(getSupportFragmentManager(), "Time");
    }

    public void onClickShowDialogDate(View view) {
        String title = "Ваша дата";

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.UK);
        Date date = new Date();
        String message = String.valueOf(formatter.format(date.getTime())) + "?";

        String neutralBText = "Верно!";
        String negativeBText = "Нет";
        String positiveBText = "Какой сейчас год?!";

        String onNeutralClickedText = "Вы выбрали кнопку \"Какой сейчас год?\"!";

        MyDialogFragment myTimeDialogFragment = new MyDialogFragment(title, message, neutralBText, negativeBText, positiveBText,  onNeutralClickedText);
        myTimeDialogFragment.show(getSupportFragmentManager(), "Date");

    }

    public void onClickShowDialogProgress(View view) {
        String title = "Ваша прогресс";

        Random ra = new Random();
        int personProgress = ra.nextInt(100);

        String message = String.valueOf(personProgress) + "%";

        String neutralBText = "Верно!";
        String negativeBText = "Нет";
        String positiveBText = "Возможно";

        String onNeutralClickedText = "Вы выбрали кнопку \"Возможно\"!";

        MyDialogFragment myTimeDialogFragment = new MyDialogFragment(title, message, neutralBText, negativeBText, positiveBText,  onNeutralClickedText);
        myTimeDialogFragment.show(getSupportFragmentManager(), "Progress");
    }

    public void onOkClicked(String str) {
        Toast.makeText(getApplicationContext(), str,
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked(String str) {
        Toast.makeText(getApplicationContext(), str,
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked(String str) {
        Toast.makeText(getApplicationContext(), str,
                Toast.LENGTH_LONG).show();
    }
}
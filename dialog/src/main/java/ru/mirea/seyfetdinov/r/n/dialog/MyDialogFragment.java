package ru.mirea.seyfetdinov.r.n.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import java.util.Timer;

public class MyDialogFragment extends DialogFragment{

    String title, message, neutralButton, negativeButton, positiveButton, okStr, canselStr, neutralStr;

    public  MyDialogFragment(String title, String message, String neutralButton, String negativeButton, String positiveButton, String neutralStr){
        this.title = title;
        this.message = message;
        this.neutralButton = neutralButton;
        this.negativeButton = negativeButton;
        this.positiveButton = positiveButton;
        this.okStr = "Вы выбрали кнопку \"Верно!\"!";
        this.canselStr = "Вы выбрали кнопку \"Нет\"!";
        this.neutralStr = neutralStr;
    }

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(title)
                .setMessage(message)
                .setIcon(R.mipmap.ic_launcher_round)
                .setPositiveButton(positiveButton, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                    }
                })
                .setNeutralButton( neutralButton,
                        new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        ((MainActivity)getActivity()).onOkClicked(okStr);
                        dialog.cancel();
                    }
                })
                .setNegativeButton(negativeButton,
                        new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        ((MainActivity)getActivity()).onCancelClicked(canselStr);
                        dialog.cancel();
                    }
                })
                .setPositiveButton(positiveButton, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        ((MainActivity)getActivity()).onNeutralClicked(neutralStr);
                        dialog.cancel();
                    }
                });
        return builder.create();
    }
}


package com.example.rental_service.upload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.rental_service.R;

import java.util.List;

public class TypeChoiceActivity extends Dialog implements View.OnClickListener{
    Context context;
    private DialogListener dialogListener;

    public TypeChoiceActivity(@NonNull Context context) {
        super(context);
        this.context = context;
    }

    public void setDialogListener(DialogListener dialogListener){
        this.dialogListener = dialogListener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_choice);
        Button stfBtn = findViewById(R.id.uploadStuffBtn);
        Button placeBtn = findViewById(R.id.uploadPlaceBtn);
        stfBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogListener.onPositiveClicked(UploadType.STUFF);
                dismiss();
            }
        });

        placeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogListener.onPositiveClicked(UploadType.PLACE);
                dismiss();
            }
        });
    }

    @Override
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, @Nullable Menu menu, int deviceId) {
        super.onProvideKeyboardShortcuts(data, menu, deviceId);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    @Override
    public void onClick(View view) {

    }
}
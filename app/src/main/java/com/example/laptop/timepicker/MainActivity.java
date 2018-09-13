package com.example.laptop.timepicker;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.pickButtonId);
        textView = findViewById(R.id.textViewId);

        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        TimePicker timePicker = new TimePicker(this);

        final int currentHour = timePicker.getCurrentHour();
        final int curentMunite = timePicker.getCurrentMinute();

        TimePickerDialog timePickerDiaog = new TimePickerDialog(MainActivity.this,

                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {

                        textView.setText(currentHour + ":" + curentMunite);

                    }
                }, currentHour, curentMunite, true);


        timePickerDiaog.show();

    }
}

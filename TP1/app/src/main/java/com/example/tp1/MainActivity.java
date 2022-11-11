package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //declaration de
    CheckBox chkAndro;
    CheckBox chkMicro;
    Button btnAffich;
    RadioGroup radSpecialityType;
    RadioButton radDSI;
    RadioButton radRSI;
    RadioButton radSEM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkAndro = findViewById(R.id.chkAndro);
        chkMicro = findViewById(R.id.chkMicro);
        btnAffich = findViewById(R.id.btnAffich);
        radSpecialityType = findViewById(R.id.radSpecialityType);
        radDSI = findViewById(R.id.radDSI);
        radRSI = findViewById(R.id.radRSI);
        radSEM = findViewById(R.id.radSEM);

        btnAffich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="specilaité : ";
                String option="club  :";
                if (chkAndro.isChecked())
                    option = option +" Android";
                if (chkMicro.isChecked())
                    option = option + " Microsoft";
                int radioId = radSpecialityType.getCheckedRadioButtonId();
                if (radSEM.getId() == radioId)
                    msg +=  "  SEM  " + option;
                if (radRSI.isChecked())
                    msg +=  "  RSI  " + option ;
                if (radDSI.isChecked())
                    msg +=  "  DSI  " +option ;
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();

            }
        });
    }// onCreate
}// class

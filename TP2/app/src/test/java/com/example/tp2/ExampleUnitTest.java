package com.example.tp2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends Activity {
    CheckBox chkAndro;
    CheckBox chkMicro;
    Button btnAffich;
    RadioGroup radSpecialityType;
    RadioButton radDSI;
    RadioButton radRSI;
    RadioButton radSEM;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkAndro = (CheckBox) findViewById(R.id.chkAndroid);
        chkMicro = (CheckBox) findViewById(R.id.chkMicrosoft);
        btnAffich = (Button) findViewById(R.id.btnAffich);
        radSpecialityType = (RadioGroup) findViewById(R.id.radioGroupSpecialiteType);
        radDSI = (RadioButton) findViewById(R.id.radDsi);
        radRSI =(RadioButton) findViewById(R.id.radRsi);
        radSEM =(RadioButton) findViewById(R.id.radSem);
        // LISTENER: Lier bouton-events-et-code
        btnAffich.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Spécialité ";
                String option="club ";
                if (chkAndro.isChecked()){
                    String msg2 = option+"Android";
                };
                if (chkMicro.isChecked()){
                    String msg2 = option+"Microsoft";
                };
                // obtenir le numéro ID boutons radio
                int radioId =
                        radSpecialityType.getCheckedRadioButtonId();
                // comparer les ID sélectionnés avec RadioButtons ID individuelelment
                if (radSEM.getId() == radioId)
                    msg ="Spécialité SEM"  ;
// C'est similaire d'utiliser .isChecked() sur chaque RadioButton
                if (radRSI.isChecked())
                    msg ="Spécialité RSI"  ;
                // C'est similaire d'utiliser .isChecked() sur chaque RadioButton
                if (radDSI.isChecked())
                    msg ="Spécialité DSI";
                Toast.makeText(getApplicationContext(), msg, 1).show();
            }// onClick
        });
    }}
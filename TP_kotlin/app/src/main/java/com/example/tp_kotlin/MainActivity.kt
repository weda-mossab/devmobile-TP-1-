package com.example.tp_kotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var chkAndro: CheckBox
    lateinit var chkMicro: CheckBox
    lateinit var btnAffich: Button
    lateinit var radSpecialitytype: RadioButton
    lateinit var radDSI: RadioButton
    lateinit var radRSI: RadioButton
    lateinit var radSEM: RadioButton


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chkAndro= findViewById(R.id.chkAndro)
        chkMicro= findViewById(R.id.chkMicro)
        btnAffich= findViewById(R.id.radSpecialityType)
        radDSI = findViewById(R.id.radDSI)
        radSEM = findViewById(R.id.radSEM)
        radRSI= findViewById(R.id.radRSI)

        btnAffich.setOnClickListener {
            var msg : String = "Spécialité"
            var option : String = "club"


            if(chkAndro.isChecked) option+= "Android"
            if(chkMicro.isChecked) option+= "Microsoft"

            if (radSEM.isChecked) msg+=  "SEM" + option
            if (radRSI.isChecked)  msg+=  "RSI" + option
            if(radDSI.isChecked) msg+= "DSI" + option

            Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show()

        }
    }
}
package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private RadioButton getRadioButtonFromMiles;
    private RadioButton getRadioButtonFromKm;
    private EditText textValue;
    private EditText textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getRadioButtonFromKm = (RadioButton)findViewById(R.id.radioButtonKm);
        getRadioButtonFromMiles = (RadioButton)findViewById(R.id.radioButtonMiles);
        textValue = (EditText) findViewById(R.id.value);
        textResult = (EditText) findViewById(R.id.result);
    }

    public void handleClick(View view){
        switch (view.getId()){
            case R.id.buttonConvert:
                String result;
                String value = textValue.getText().toString();
                if(getRadioButtonFromMiles.isChecked()){
                    result = milesToKM(value);
                }
                else{
                    result = kmToMiles(value);
                }
                textResult.setText(result);
            case R.id.buttonReset:
                getRadioButtonFromKm.setChecked(true);
                getRadioButtonFromMiles.setChecked(false);
                textValue.setText("");
                textResult.setText("");
        }
    }

    private String milesToKM(String miles){
        double m_value = Double.parseDouble(miles);
        double km_value = m_value * 1.609;
        return String.valueOf(km_value);
    }
    private String kmToMiles(String km){
        double km_value = Double.parseDouble(km);
        double m_value = km_value / 1.609;
        return String.valueOf(m_value);
    }
}
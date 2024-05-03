package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {
    private Button savetextButton;
    private SharedPreferences.Editor myPreferenceEditor;
    private SharedPreferences myPreferenceRef;
    //private TextView prefTextRef;

    EditText newPrefText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        myPreferenceRef = getSharedPreferences("MyAppPreferenceString",MODE_PRIVATE);
        myPreferenceEditor = myPreferenceRef.edit();

        savetextButton = findViewById(R.id.prefButton);
        savetextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                savePref(view);
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }

    public void savePref(View v){

        // Get the text
        newPrefText = (EditText)findViewById(R.id.settingseditview);

        // Store the new preference
        myPreferenceEditor.putString("MyAppPreferenceString", newPrefText.getText().toString());
        myPreferenceEditor.apply();

        // Clear the EditText
        newPrefText.setText("");
    }

}
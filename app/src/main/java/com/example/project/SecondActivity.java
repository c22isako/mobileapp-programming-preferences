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

    EditText newPrefText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        savetextButton = findViewById(R.id.prefButton);
        savetextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }

    public void savePref(View v){

        Log.d("Potatis","Kommer till savePref");
        // Get the text
        //EditText newPrefText = new EditText(this);
        newPrefText = (EditText)findViewById(R.id.settingseditview);
        Log.d("Potatis","Kommer till edit text set thing ");

        // Store the new preference
        myPreferenceEditor.putString("MyAppPreferenceString", newPrefText.getText().toString());
        Log.d("Potatis","Sparat till string");

        myPreferenceEditor.apply();
        //myPreferenceEditor.commit();

        // Display the new preference
        TextView prefTextRef = new TextView(this);
        prefTextRef = (TextView)findViewById(R.id.prefText);
        prefTextRef.setText(myPreferenceRef.getString("MyAppPreferenceString", "No preference found."));

        // Clear the EditText
        newPrefText.setText("");
    }

}
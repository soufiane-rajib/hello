package fr.ensitech.hello;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNom;
    private EditText editTextPrenom;
    private Button buttonSuivant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNom = findViewById(R.id.editTextNom);
        editTextPrenom = findViewById(R.id.editTextPrenom);
        buttonSuivant = findViewById(R.id.btnSuivant);
        buttonSuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editTextNom.getText().toString().trim().isEmpty()
                        || editTextPrenom.getText().toString().trim().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Tous les champs sont obligatoires", Toast.LENGTH_LONG).show();
                    return;
                }
                Log.i(TAG, "Prénom = "+ editTextPrenom.getText().toString() + ".Nom = "+ editTextNom.getText().toString());

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }

        });

    }

}
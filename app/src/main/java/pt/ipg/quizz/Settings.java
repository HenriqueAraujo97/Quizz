package pt.ipg.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        Button buttonCancelar = findViewById(R.id.buttonCancelar);
        buttonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });
        Button buttonGuardar = findViewById(R.id.buttonGuardar);
        buttonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextNome = findViewById(R.id.editTextNome);
                String mensagem = editTextNome.getText().toString();

                if (mensagem.trim().length() == 0) {
                    editTextNome.setError(getString(R.string.nome_obrig));
                }else if (!mensagem.matches("[a-zA-Z ]")){
                    editTextNome.setError(getString(R.string.charact));
                }else{
                    finish();
                    Toast.makeText(Settings.this,"Jogador Guardado",Toast.LENGTH_SHORT).show();
                }
            }
        });










    }
}

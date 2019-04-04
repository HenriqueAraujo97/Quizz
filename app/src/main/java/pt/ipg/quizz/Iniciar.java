package pt.ipg.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Iniciar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar);

        Button buttonCancelar1 = findViewById(R.id.buttonCancelar1);
        buttonCancelar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });

       Button buttonDefinic = findViewById(R.id.buttonDefinic);
       buttonDefinic.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent intentD = new Intent(v.getContext(),Definic.class);
               startActivity(intentD);

           }
       });


        Button buttonGuardar1 = findViewById(R.id.buttonGuardar1);
        buttonGuardar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextNome = findViewById(R.id.InputEditTextTema);
                String mensagem = editTextNome.getText().toString();

                if (mensagem.trim().length() == 0) {
                    editTextNome.setError(getString(R.string.nome_obrig));
                }else if (!mensagem.matches("[a-zA-Z ]")){
                    editTextNome.setError(getString(R.string.charact));
                }else{
                    finish();
                    Toast.makeText(Iniciar.this,"Jogador Guardado",Toast.LENGTH_SHORT).show();
                }
            }
        });





    }
}

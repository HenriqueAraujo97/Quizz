package pt.ipg.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Definic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definic);


        Button buttonCancelar2 = findViewById(R.id.buttonCancelar2);
        buttonCancelar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });


        Button buttonEliminar2 = findViewById(R.id.buttonEliminar2);
        buttonEliminar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(Definic.this,"Conteúdo Apagado",Toast.LENGTH_SHORT).show();
            }

        });


    }
}

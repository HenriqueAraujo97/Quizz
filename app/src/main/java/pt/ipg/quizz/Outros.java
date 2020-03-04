package pt.ipg.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Outros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outros);


        Button buttonInserir = findViewById(R.id.buttonInserir);
        buttonInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IntentI = new Intent(v.getContext(),Definic.Inserir);
            }
        });




    }
}

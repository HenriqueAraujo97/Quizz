package pt.ipg.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Creditos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);
        Toast.makeText(Creditos.this,"Creditos do jogo",Toast.LENGTH_SHORT).show();
    }

}

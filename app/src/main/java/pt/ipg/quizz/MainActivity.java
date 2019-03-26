package pt.ipg.quizz;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        buttonCreditos =(Button)findViewById(R.id.buttonCreditos);
        buttonCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreditos();
            }
        });
        buttonOpcao = (Button) findViewById(R.id.buttonOpcao);
        buttonOpcao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              openSettings();
            }

        });



       buttonInicar = (Button) findViewById(R.id.buttonIniciar);
       buttonInicar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openIniciar();
           }
       });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private Button buttonInicar;
    private Button buttonCreditos;
    private Button buttonOpcao;


    public void openIniciar(){
        Intent intenti = new Intent(this,Iniciar.class);
        startActivity(intenti);
    }

    public void openCreditos(){
        Intent intentc = new Intent(this,Creditos.class);
        startActivity(intentc);
    }

    public void openSettings(){
        Intent intentS = new Intent(this,Settings.class);
        startActivity(intentS);
    }

}

package com.example.botaoola3;

import androidx.appcompat.app.AppCompatActivity;
import botaoola3.R;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/* repositorio
        https://github.com/udofritzke/BotaoOla3_20231
*/

public class MainActivity extends AppCompatActivity {
    private int contagem = 0;
    private TextView mostraContagem;
    private static final String TAG = "AtividadeExemplo";

    private static final String CONTAGEM = "CONTAGEM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate() executado");
        mostraContagem = (TextView) findViewById(R.id.mostra_contagem);

        if (savedInstanceState != null) {
            // Recupera valor de variáveis de instância do estado salvo
            contagem = savedInstanceState.getInt(CONTAGEM);
        }
        if(mostraContagem != null)
            mostraContagem.setText(Integer.toString(contagem));

    }

    public void mostraMensagem(View view) {
        Toast ola = Toast.makeText(this, R.string.ola, Toast.LENGTH_SHORT);
        ola.show();
    }

    public void mostraContagem(View view) {
        ++contagem;
        if (mostraContagem != null)
            mostraContagem.setText(Integer.toString(contagem));
    }

    public void onSaveInstanceState(Bundle savedInstanceState) {
        // salva variável de instância no estado da Activity
        savedInstanceState.putInt(CONTAGEM, contagem);
        Log.d(TAG, "onSaveInstanceState() executado");

        // chamar a superclasse para salvar o estado da hierarquia do view
        super.onSaveInstanceState(savedInstanceState);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() executado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() executado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() executado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() executado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() executado");
    }
}
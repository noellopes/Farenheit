package pt.ipg.farenheit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ConsultarTemperaturaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_temperatura);

        TextView textViewCelsius = findViewById(R.id.textViewCelsius);
        textViewCelsius.setText(String.valueOf(DadosApp.temperatura.GetCelsius()));

        TextView textViewFahrenheit = findViewById(R.id.textViewFahrenheit);
        textViewFahrenheit.setText(String.valueOf(DadosApp.temperatura.GetFahrenheit()));
    }
}
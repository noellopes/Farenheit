package pt.ipg.farenheit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ConsultarTemperaturaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_temperatura);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        TextView textViewCelsius = findViewById(R.id.textViewCelsius);
        textViewCelsius.setText(
                decimalFormat.format(DadosApp.temperatura.GetCelsius())
        );

        TextView textViewFahrenheit = findViewById(R.id.textViewFahrenheit);
        textViewFahrenheit.setText(
                decimalFormat.format(DadosApp.temperatura.GetFahrenheit())
        );
    }
}
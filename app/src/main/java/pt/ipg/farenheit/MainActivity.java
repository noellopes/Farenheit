package pt.ipg.farenheit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostraTemperatura(View view) {
        EditText editTextTemperatura = findViewById(R.id.editTextTemperatura);
        String s = editTextTemperatura.getText().toString();

        double temperatura;
        try {
            temperatura = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            editTextTemperatura.setError("Introduza uma temperatura válida");
            editTextTemperatura.requestFocus();
            return;
        }

        RadioButton radioButtonCelcius = findViewById(R.id.radioButtonCelcius);
        RadioButton radioButtonFahrenheit = findViewById(R.id.radioButtonFahrenheit);

        if (radioButtonCelcius.isChecked()) {
            DadosApp.temperatura = new TemperaturaCelsius(temperatura);
        } else if (radioButtonFahrenheit.isChecked()) {
            DadosApp.temperatura = new TemperaturaFahrenheit(temperatura);
        } else {
            radioButtonCelcius.setError("Indique as unidades da temperatura");
            radioButtonFahrenheit.setError("Indique as unidades da temperatura");

            Toast.makeText(this, "Indique as unidades da temperatura", Toast.LENGTH_LONG).show();

            return;
        }

        Intent intent = new Intent(this, ConsultarTemperaturaActivity.class);
        startActivity(intent);
    }
}
package pt.ipg.farenheit;

public class TemperaturaFahrenheit extends Temperatura {
    public TemperaturaFahrenheit(double valor) {
        this.valor = valor;
    }

    @Override
    public double GetFahrenheit() {
        return valor;
    }

    @Override
    public double GetCelsius() {
        return (valor - 32.0) * 5.0 / 9.0;
    }
}

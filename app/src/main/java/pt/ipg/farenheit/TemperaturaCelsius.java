package pt.ipg.farenheit;

public class TemperaturaCelsius extends Temperatura {
    public TemperaturaCelsius(double valor) {
        this.valor = valor;
    }

    @Override
    public double GetFahrenheit() {
        return (valor * 1.8) + 32.0;
    }

    @Override
    public double GetCelsius() {
        return valor;
    }
}

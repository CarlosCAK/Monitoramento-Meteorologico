import java.util.ArrayList;

public class StatisticsDisplay implements Display{
    private WeatherData dadosDisplay;


    public WeatherData getWeatherData() {
        return this.dadosDisplay;
    }

    @Override
    public void Atualizar(WeatherStation weatherStation) {
        weatherStation.getWeatherData().definirMedicao();
        this.dadosDisplay = weatherStation.getWeatherData();
    }

    public String exibirDados() {
        return  this.dadosDisplay.toString();
    }

    @Override
    public void addDisplayWeatherStation(WeatherStation weatherStation) {
        weatherStation.addDisplay(this);
    }
}

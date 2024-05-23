import java.util.ArrayList;

public class StatisticsDisplay implements Display{
    private WeatherData dadosDisplay;


    public WeatherData getWeatherData() {
        return this.dadosDisplay;
    }

    @Override
    public void atualizar(WeatherStation weatherStation) {
        weatherStation.getWeatherData().definirMedicao();
        this.dadosDisplay = weatherStation.getWeatherData();
        weatherStation.addDisplay(this);
    }

    public String exibirDados() {
        return  this.dadosDisplay.toString();
    }

    @Override
    public void addDisplayWeatherStation(WeatherStation weatherStation) {
        weatherStation.addDisplay(this);
    }
}

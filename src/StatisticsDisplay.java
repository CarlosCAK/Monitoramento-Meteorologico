import java.util.ArrayList;

public class StatisticsDisplay implements Display{
    private WeatherData dadosDisplay;



    @Override
    public WeatherData getWeatherData() {
        return this.dadosDisplay;
    }

    @Override
    public void Atualizar(WeatherStation weatherStation) {
        weatherStation.getWeatherData().definirMedicao();
        this.dadosDisplay = weatherStation.getWeatherData();
    }

    @Override
    public String exibirDados(WeatherStation weatherStation) {
        return  weatherStation.getWeatherData().toString();
    }

    @Override
    public void addDisplayWeatherStation(WeatherStation weatherStation) {
        weatherStation.addDisplay(this);
    }
}

import java.util.ArrayList;

public class CurrentConditionalsDisplay implements Display{
    private WeatherData dadosDisplay;

    @Override
    public void Atualizar(WeatherStation weatherStation) {
        weatherStation.getWeatherData().definirMedicao();
    }

    @Override
    public WeatherData getWeatherData(){
        return null;
    }

    @Override
    public String exibirDados(WeatherStation weatherStation) {
        return weatherStation.getWeatherData().toString();
    }

    @Override
    public void addDisplayWeatherStation(WeatherStation weatherStation) {
        weatherStation.addDisplay(this);
    }
}

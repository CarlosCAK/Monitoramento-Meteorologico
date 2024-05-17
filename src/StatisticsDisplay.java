import java.util.ArrayList;

public class StatisticsDisplay implements Display{

    @Override
    public void Atualizar(WeatherStation weatherStation) {
        weatherStation.getWeatherData().atualizarDados();
    }

    @Override
    public String exibirDados(WeatherStation weatherStation) {
        return  weatherStation.getWeatherData().toString();
    }
}

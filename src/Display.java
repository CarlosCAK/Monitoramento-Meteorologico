import java.util.ArrayList;

public interface Display {

    public WeatherData getWeatherData();

    void Atualizar(WeatherStation weatherStation );

    String exibirDados(WeatherStation weatherStation);

    void addDisplayWeatherStation(WeatherStation weatherStation);

}

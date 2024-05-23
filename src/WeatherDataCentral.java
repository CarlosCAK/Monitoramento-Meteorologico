import java.util.ArrayList;

public class WeatherDataCentral {
    private ArrayList<WeatherData> weatherData = new ArrayList<>();

    public void addEstacoes(WeatherData weatherStation){
        weatherData.add(weatherStation);
    }

    public ArrayList<WeatherData> getEstacoes() {
        return this.weatherData;
    }

    public WeatherData getEstacoes(int indice){
        return this.weatherData.get(indice);
    }



}

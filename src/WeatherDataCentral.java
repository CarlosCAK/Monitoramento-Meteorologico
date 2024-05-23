import java.util.ArrayList;

public class WeatherDataCentral {
    private ArrayList<WeatherStation> weatherStations = new ArrayList<>();

    public void addEstacoes(WeatherStation weatherStation){
        weatherStations.add(weatherStation);
    }

    public ArrayList<WeatherStation> getEstacoes() {
        return this.weatherStations;
    }

    public WeatherStation getEstacoes(int indice){
        return this.weatherStations.get(indice);
    }



}

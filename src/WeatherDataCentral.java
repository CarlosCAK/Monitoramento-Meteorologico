import java.util.ArrayList;
import java.util.HashMap;

public class WeatherDataCentral {
    private HashMap <Integer,WeatherStation> weatherStations = new HashMap<>();

    public void addEstacoes( Integer codigo, WeatherStation weatherStation){

        weatherStations.put(codigo,weatherStation);
    }

    public HashMap<Integer, WeatherStation> getWeatherStations() {
        return this.weatherStations;
    }
    public WeatherStation getEstacao(Integer codigo){
       return this.weatherStations.get(codigo);
    }

    public void setWeatherStations(HashMap<Integer, WeatherStation> weatherStations) {
        this.weatherStations = weatherStations;
    }


    public WeatherStation getEstacoes(int indice){
        return this.weatherStations.get(indice);
    }



}

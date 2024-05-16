import java.util.ArrayList;

public class WeatherDataCentral {
    private ArrayList<WeatherStation> estacoes = new ArrayList<>();

    public void addEstacoes(WeatherStation weatherStation){
        estacoes.add(weatherStation);
    }

    public ArrayList<WeatherStation> getEstacoes() {
        return this.estacoes;
    }
    public WeatherStation getEstacoes(int indice){
        return this.estacoes.get(indice);
    }

}

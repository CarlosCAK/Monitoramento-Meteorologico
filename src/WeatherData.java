import java.util.ArrayList;
import java.util.Random;

public class WeatherData {
    private double temperatura;
    private double umidade;
    private double pressao;
    private ArrayList <Double> mediaTemperatura = new ArrayList<>();
    private WeatherStation weatherStation;

    public WeatherStation getWeatherStation() {
        return this.weatherStation;
    }

    public void setWeatherStation(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temperatura=" + this.temperatura + "°C\n" +
                ", umidade=" + this.umidade + "%"+
                ", pressao=" + this.pressao + "PA" +
                '}';
    }

    public double getTemperatura() {
        return this.temperatura;
    }

    public double getUmidade() {
        return this.umidade;
    }


    public double getPressao() {
        return this.pressao;
    }

    public void atualizarDados(){
        Random randomico = new Random();

        this.pressao = Math.round(randomico.nextDouble() * 200);
        this.temperatura = Math.round(randomico.nextDouble() * 45);
        this.umidade = Math.round(randomico.nextDouble() * 100);


    }
    public void addHistoricoTemperatura(double temperatura){
        this.mediaTemperatura.add(temperatura);
    }


}

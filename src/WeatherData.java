import java.util.ArrayList;
import java.util.Random;

public class WeatherData {
    private double temperatura;
    private double umidade;
    private double pressao;
    private ArrayList <WeatherData> historico = new ArrayList<>();


    @Override
    public String toString() {
        return "WeatherData{" +
                "temperatura=" + this.temperatura + "°C\n" +
                ", umidade=" + this.umidade + "%"+
                ", pressao=" + this.pressao + "PA" +
                '}';
    }


    public void definirMedicao(){
        Random randomico = new Random();

        this.pressao = Math.round(randomico.nextDouble() * 200);
        this.temperatura = Math.round(randomico.nextDouble() * 45);
        this.umidade = Math.round(randomico.nextDouble() * 100);

    }


}

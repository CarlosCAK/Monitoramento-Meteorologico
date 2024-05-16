import java.util.Random;

public class WeatherData {
    private double temperatura;
    private double umidade;
    private double pressao;

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

        this.pressao = randomico.nextDouble() * 200;
        this.temperatura = randomico.nextDouble() * 45;
        this.umidade = randomico.nextDouble() * 100;
    }


}

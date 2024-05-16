import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WeatherData dadosEstacao = new WeatherData();
        WeatherStation estacao = new WeatherStation();

        while(true) {
            Thread.sleep(5000);
            estacao.setWeatherData(dadosEstacao);
            estacao.notificarDisplays();
            System.out.println(estacao.getWeatherData().toString());
        }

    }
}

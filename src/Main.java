import java.util.Random;

public class Main {

    public static void main(String[] args) {

        WeatherData dadosEstacao = new WeatherData();
        WeatherStation estacao = new WeatherStation();

        estacao.setWeatherData(dadosEstacao);
        estacao.notificarDisplays();
        System.out.println(estacao.getWeatherData().toString()
        );
    }
}

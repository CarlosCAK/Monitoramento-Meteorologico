import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WeatherData dadosEstacao = new WeatherData();
        WeatherStation estacao = new WeatherStation();
        CurrentConditionalsDisplay condicoesAtuais = new CurrentConditionalsDisplay();

        estacao.setWeatherData(dadosEstacao);


            condicoesAtuais.Atualizar(estacao);
        System.out.println(condicoesAtuais.exibirDados(estacao));

    }
}

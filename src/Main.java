import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {


    static HashMap<Integer,WeatherStation> mapEstacoes = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    static CurrentConditionalsDisplay condicoesAtuais = new CurrentConditionalsDisplay();
    public static void main(String[] args) throws InterruptedException {

        StatisticsDisplay displayEstatistica = new StatisticsDisplay();

        WeatherStation w1 = new WeatherStation();

        displayEstatistica.Atualizar(w1);

        displayEstatistica.addDisplayWeatherStation(w1);

        System.out.println(w1.getDisplay(0).getWeatherData().toString());



    }
    public static void cadastrarEstacao(){
        WeatherStation e1 = new WeatherStation();

        sc.nextLine();
        System.out.println("Digite o nome da estação");
        e1.setNome(sc.nextLine());

        System.out.println("Digite o código da estação");
        e1.setCodigo(sc.nextInt());

        e1.getWeatherData().definirMedicao();

        mapEstacoes.put(e1.getCodigo(),e1);
    }
    public static void telaExibicaoInformacoesTotais() throws InterruptedException {
        int opcao;
        System.out.println("Digite o código da estação que deseja exibir as informações");
        opcao = sc.nextInt();

        while (true){
            TimeUnit.SECONDS.sleep(5);
            mapEstacoes.get(opcao).getWeatherData().definirMedicao();
            System.out.println(condicoesAtuais.exibirDados(mapEstacoes.get(opcao)));
        }

    }
}

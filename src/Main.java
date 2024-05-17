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


        while (true){
            System.out.println("Digite a opção desejada\n"+
                               "1- Cadastrar estação\n"+
                               "2- Informações gerais de uma estação");

            switch (sc.nextInt()){
                case 1 :
                    cadastrarEstacao();
                    break;
                case 2:
                    telaExibicaoInformacoesTotais();
                    break;
            }
        }

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {


    static HashMap<Integer,WeatherStation> mapEstacoes = new HashMap<>();
    static WeatherDataCentral dataCenter = new WeatherDataCentral();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        int opcao;

        do {
            System.out.println("Digite o que deseja realizar" +
                    "\n1- Cadastrar Estacao" +
                    "\n2- Visualizar as telas de uma estação por 1 minuto");

            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    cadastrarEstacao();
                    break;
                case 2:
                    telaExibicaoInformacoesTotais();
                    break;
            }

        }while(opcao != 0);
    }
    public static void cadastrarEstacao(){
        WeatherStation e1 = new WeatherStation();

        sc.nextLine();
        System.out.println("Digite o nome da estação");
        e1.setNome(sc.nextLine());

        System.out.println("Digite o código da estação");
        e1.setCodigo(sc.nextInt());

        e1.getWeatherData().definirMedicao();
        dataCenter.addEstacoes(e1);
        mapEstacoes.put(e1.getCodigo(),e1);

    }
    public static void telaExibicaoInformacoesTotais() throws InterruptedException {
        int opcao;
        System.out.println("Digite o código da estação que deseja exibir as informações");
        opcao = sc.nextInt();


        while (true){
            StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
            CurrentConditionalsDisplay currentConditionalsDisplay = new CurrentConditionalsDisplay();

            statisticsDisplay.atualizar(mapEstacoes.get(opcao));
            currentConditionalsDisplay.atualizar(mapEstacoes.get(opcao));

            TimeUnit.SECONDS.sleep(1);

            for (int i = mapEstacoes.get(opcao).getTamanhoListaTelas() - 2; i < mapEstacoes.get(opcao).getTamanhoListaTelas(); i++){
                if(mapEstacoes.get(opcao).getDisplay(i).getClass().getName().equals("StatisticsDisplay")){
                    System.out.println(((StatisticsDisplay)mapEstacoes.get(opcao).getDisplay(i)).exibirDados()+ "\n");
                }
                else if (mapEstacoes.get(opcao).getDisplay(i).getClass().getName().equals("CurrentConditionalsDisplay")){
                    System.out.println("MEDIA GERAL");
                    System.out.println(((CurrentConditionalsDisplay)mapEstacoes.get(opcao).getDisplay(i)).getInformacoesAdicionais() + "\n");
                }
            }



        }

    }
}

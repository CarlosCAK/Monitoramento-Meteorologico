import java.util.ArrayList;

public class CurrentConditionalsDisplay implements Display{
    private WeatherData mediaDosDados = new WeatherData();


    @Override
    public void atualizar(WeatherStation weatherStation) {
        calcInformacoesAdicionais(weatherStation);
        weatherStation.addDisplay(this);
    }

    @Override
    public void addDisplayWeatherStation(WeatherStation weatherStation) {
        weatherStation.addDisplay(this);
    }

    public String getInformacoesAdicionais(){
        return this.mediaDosDados.toString();
    }


    private void calcInformacoesAdicionais(WeatherStation weatherStation){

        double somaTemperatura = 0, somaUmidade = 0 , somaPressao = 0, mediaTemperatura = 0,mediaUmidade = 0, mediaPressao = 0 ;
        for (Display statisticsDisplay : weatherStation.getDisplays()) {
            if (statisticsDisplay.getClass().getName().equals("StatisticsDisplay")){


                somaTemperatura += ((StatisticsDisplay)statisticsDisplay).getWeatherData().getTemperatura();
                somaUmidade += ((StatisticsDisplay)statisticsDisplay).getWeatherData().getUmidade();
                somaPressao += ((StatisticsDisplay)statisticsDisplay).getWeatherData().getPressao();


            }
        }



        mediaTemperatura = somaTemperatura / ( (weatherStation.getTamanhoListaTelas() + 1 ) /2 );
        mediaUmidade = somaUmidade /    ( (weatherStation.getTamanhoListaTelas() + 1 ) /2 );
        mediaPressao = somaPressao / ( (weatherStation.getTamanhoListaTelas() + 1 ) /2 );





        this.mediaDosDados.setTemperatura(mediaTemperatura);
        this.mediaDosDados.setUmidade(mediaUmidade);
        this.mediaDosDados.setPressao(mediaPressao);





    }
}


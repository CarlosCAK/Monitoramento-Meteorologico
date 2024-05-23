import java.util.ArrayList;

public class CurrentConditionalsDisplay implements Display{
    private WeatherData mediaDosDados;


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
        int contStatisticsDisplays = 0;
        double somaTemperatura = 0, somaumidade = 0 , somaPressao = 0 ;
        for (Display statisticsDisplay : weatherStation.getDisplays()) {
            if (statisticsDisplay.getClass().getName().equals("StatisticsDisplay")){
                contStatisticsDisplays++;
                somaTemperatura += ((StatisticsDisplay)statisticsDisplay).getWeatherData().getTemperatura();
                somaumidade += ((StatisticsDisplay)statisticsDisplay).getWeatherData().getUmidade();
                somaPressao += ((StatisticsDisplay)statisticsDisplay).getWeatherData().getPressao();
            }
        }
        WeatherData weatherData = new WeatherData();

        weatherData.setTemperatura((somaTemperatura /= contStatisticsDisplays));
        weatherData.setUmidade((somaumidade /= contStatisticsDisplays));
        weatherData.setPressao((somaPressao /= contStatisticsDisplays));

        this.mediaDosDados = weatherData;


    }
}


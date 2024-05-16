public class WeatherStation {

    private WeatherData weatherData;
    private int codigo;

    public WeatherData getWeatherData() {
        return this.weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void notificarDisplays(){
        this.weatherData.atualizarDados();
    }
}

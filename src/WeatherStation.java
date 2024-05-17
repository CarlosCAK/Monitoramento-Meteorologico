import java.util.ArrayList;

public class WeatherStation {

    private WeatherData weatherData = new WeatherData();
    private int codigo;
    private String nome;
    private ArrayList <WeatherData> historico = new ArrayList<>();


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

}

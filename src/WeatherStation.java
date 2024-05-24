import java.util.ArrayList;

public class WeatherStation {

    private WeatherData weatherData = new WeatherData();
    private int codigo;
    private String nome;
    private ArrayList <Display> telas = new ArrayList<>();


    public void addDisplay(Display display){
        this.telas.add(display);
    }
    public Display getDisplay(int indice){
        return this.telas.get(indice);
    }

    public ArrayList<Display> getDisplays() {
        return this.telas;
    }
    public int getTamanhoListaTelas(){
        return this.telas.size();
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
            return true;
        }
        return false;
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

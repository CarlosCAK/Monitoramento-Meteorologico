public class Display {
    private double temperatura;
    private String umidade;
    private String pressao;

    public double getTemperatura() {
        return temperatura;
    }

    public boolean setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        return true;
    }

    public String getUmidade() {
        return umidade;
    }

    public boolean setUmidade(String umidade) {
        this.umidade = umidade;
        return true;
    }

    public String getPressao() {
        return pressao;

    }

    public boolean setPressao(String pressao) {
        this.pressao = pressao;
        return true;
    }
}

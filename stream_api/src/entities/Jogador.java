package entities;

public class Jogador {

    private String name;
    private String posicao;
    private int idade;
    private String timeAtual;
    private int golsMarcados;

    public Jogador(String name, String posicao, int idade, String timeAtual, int golsMarcados) {
        this.name = name;
        this.posicao = posicao;
        this.idade = idade;
        this.timeAtual = timeAtual;
        this.golsMarcados = golsMarcados;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTimeAtual() {
        return timeAtual;
    }

    public void setTimeAtual(String timeAtual) {
        this.timeAtual = timeAtual;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "name='" + name + '\'' +
                ", posicao='" + posicao + '\'' +
                ", timeAtual='" + timeAtual + '\'' +
                '}';
    }
}

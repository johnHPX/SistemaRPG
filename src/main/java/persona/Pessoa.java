package persona;

public abstract class Pessoa {
    private String nome;
    private String personalidade;
    private int pontosVida;
    private int pontosMagia;
    private int nivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public int getPontosMagia() {
        return pontosMagia;
    }

    public void setPontosMagia(int pontosMagia) {
        this.pontosMagia = pontosMagia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}

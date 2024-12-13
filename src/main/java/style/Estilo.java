package style;

public abstract class Estilo {
    private String nome;
    private int bonusDano;
    private String resistencia;
    private int bonusResistencia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBonusDano() {
        return bonusDano;
    }

    public void setBonusDano(int bonusDano) {
        this.bonusDano = bonusDano;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public int getBonusResistencia() {
        return bonusResistencia;
    }

    public void setBonusResistencia(int bonusResistencia) {
        this.bonusResistencia = bonusResistencia;
    }

    public abstract void status();

}

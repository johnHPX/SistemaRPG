package style;

import entity.Inimigo;
import weapon.Arma;

public abstract class Estilo {
    private String nome;
    private int bonusDano;
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

    public int getBonusResistencia() {
        return bonusResistencia;
    }

    public void setBonusResistencia(int bonusResistencia) {
        this.bonusResistencia = bonusResistencia;
    }

    public abstract void ataqueNormal(Arma arma, Inimigo inimigo);

    public abstract void ataqueEspecial(Arma arma, Inimigo inimigo);
}

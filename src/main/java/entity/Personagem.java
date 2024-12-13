package entity;

import estilo.Estilo;

public abstract class Personagem extends Entidade{
    private Estilo estilo;

    public String getEstilo() {
        return estilo.getClass().getSimpleName();
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }
}

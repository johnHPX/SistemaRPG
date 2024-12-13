package character.factorys;

import character.personas.Rikku;
import character.personas.Vaan;
import entity.Personagem;

public class FabricaLadrao implements FabricaPersonagem{
    @Override
    public Personagem criar(Class<? extends Personagem> p) {
        if (p.equals(Vaan.class))
            return new Vaan();
        else if (p.equals(Rikku.class))
            return new Rikku();

        return null;
    }
}

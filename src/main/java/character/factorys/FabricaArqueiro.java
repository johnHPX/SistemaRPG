package character.factorys;

import character.personas.Wakkar;
import character.personas.Wander;
import entity.Personagem;

public class FabricaArqueiro implements FabricaPersonagem{
    @Override
    public Personagem criar(Class<? extends Personagem> p) {
        if (p.equals(Wakkar.class))
            return new Wakkar();
        else if(p.equals(Wander.class))
            return new Wander();

        return null;
    }
}

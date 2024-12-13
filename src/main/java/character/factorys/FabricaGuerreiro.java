package character.factorys;

import character.personas.Cloud;
import character.personas.Link;
import entity.Personagem;

public class FabricaGuerreiro implements FabricaPersonagem{
    @Override
    public Personagem criar(Class<? extends Personagem> p) {

        if(p.equals(Link.class))
            return new Link();
        else if(p.equals(Cloud.class))
            return new Cloud();

        return null;
    }
}

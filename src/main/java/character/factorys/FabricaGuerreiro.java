package character.factorys;

import character.characters.Cloud;
import character.characters.Link;
import entity.Personagem;

public class FabricaGuerreiro implements FabricaPersonagem{
    @Override
    public Personagem criar(Class p) {

        if(p.equals(Link.class))
            return new Link();
        else if(p.equals(Cloud.class))
            return new Cloud();

        return null;
    }
}

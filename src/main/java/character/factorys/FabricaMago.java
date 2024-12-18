package character.factorys;

import character.characters.Gandalf;
import character.characters.Saruman;
import entity.Personagem;

public class FabricaMago implements FabricaPersonagem{
    @Override
    public Personagem criar(Class<? extends Personagem> p) {

        if (p.equals(Gandalf.class))
            return new Gandalf();
        else if (p.equals(Saruman.class))
            return new Saruman();

        return null;
    }
}

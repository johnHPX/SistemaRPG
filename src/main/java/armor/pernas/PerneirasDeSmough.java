package armor.pernas;

import armor.DecoratorArmadura;
import entity.Personagem;

public class PerneirasDeSmough extends DecoratorArmadura {

    public PerneirasDeSmough(Personagem p) {
        super(p);
        setArmadura("Perneiras de Smough");
        setPv(38);
    }

}
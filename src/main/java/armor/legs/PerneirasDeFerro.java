package armor.legs;

import armor.DecoratorArmadura;
import entity.Personagem;

public class PerneirasDeFerro extends DecoratorArmadura {

    public PerneirasDeFerro(Personagem p) {
        super(p);
        setArmadura("Perneiras de Ferro");
        setPv(23);
    }

}
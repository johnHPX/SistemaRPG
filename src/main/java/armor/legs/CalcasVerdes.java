package armor.legs;

import armor.DecoratorArmadura;
import entity.Personagem;

public class CalcasVerdes extends DecoratorArmadura {

    public CalcasVerdes(Personagem p) {
        super(p);
        setArmadura("Calças Verdes");
        setPv(15);
    }

}
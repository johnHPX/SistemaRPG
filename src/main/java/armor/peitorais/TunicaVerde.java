package armor.peitorais;

import armor.DecoratorArmadura;
import entity.Personagem;

public class TunicaVerde extends DecoratorArmadura {

    public TunicaVerde(Personagem p) {
        super(p);
        setArmadura("Túnica Verda");
        setPv(13);
    }

}
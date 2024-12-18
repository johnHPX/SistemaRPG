package armor.gloves;

import armor.DecoratorArmadura;
import entity.Personagem;

public class LuvasDeFerro extends DecoratorArmadura {

	public LuvasDeFerro(Personagem p) {
		super(p);
		setArmadura("Luvas de Ferro");
		setPv(4);
	}

}
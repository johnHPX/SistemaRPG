package armor.luvas;

import armor.DecoratorArmadura;
import entity.Personagem;

public class LuvasDeFeiticeira extends DecoratorArmadura {

	public LuvasDeFeiticeira(Personagem p) {
		super(p);
		setArmadura("Luvas De Feiticeira");
		setPv(4);
	}

}


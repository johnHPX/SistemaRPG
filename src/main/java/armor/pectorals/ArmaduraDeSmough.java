package armor.pectorals;

import armor.DecoratorArmadura;
import entity.Personagem;

public class ArmaduraDeSmough extends DecoratorArmadura {

	public ArmaduraDeSmough(Personagem p) {
		super(p);
		setArmadura("Armadura de Smough");
		setPv(40);
	}

}
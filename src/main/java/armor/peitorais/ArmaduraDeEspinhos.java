package armor.peitorais;

import armor.DecoratorArmadura;
import entity.Personagem;

public class ArmaduraDeEspinhos extends DecoratorArmadura {

	public ArmaduraDeEspinhos(Personagem p) {
		super(p);
		setArmadura("Armadura de Espinhos");
		setPv(19);
	}

}
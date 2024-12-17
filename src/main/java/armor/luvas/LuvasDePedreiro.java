package armor.luvas;

import armor.DecoratorArmadura;
import entity.Personagem;

public class LuvasDePedreiro extends DecoratorArmadura {

	public LuvasDePedreiro(Personagem p) {
		super(p);
		setArmadura("Luvas de Pedreiro");
		setPv(8);
	}
}
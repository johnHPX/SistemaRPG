package armor.helmets;

import armor.DecoratorArmadura;
import entity.Personagem;

public class ElmoDeJavaliPresa extends DecoratorArmadura {

	public ElmoDeJavaliPresa(Personagem p) {
		super(p);
		setPv(30);
		setArmadura("Elmo De Javali Presa");
	}

}
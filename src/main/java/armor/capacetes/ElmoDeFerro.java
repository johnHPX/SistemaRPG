package armor.capacetes;

import armor.DecoratorArmadura;
import entity.Personagem;

public class ElmoDeFerro extends DecoratorArmadura {
	
	public ElmoDeFerro(Personagem p) {
		super(p);
		setPv(12);
		setArmadura("Elmo de Ferro");
	}

}

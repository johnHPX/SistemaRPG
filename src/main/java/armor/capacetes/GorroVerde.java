package armor.capacetes;

import armor.DecoratorArmadura;
import entity.Personagem;

public class GorroVerde extends DecoratorArmadura {

	public GorroVerde(Personagem p){
		super(p);
		setPv(10);
		setArmadura("Gorro Verde");
	}

}
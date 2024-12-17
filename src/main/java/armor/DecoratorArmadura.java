package armor;

import entity.*;
import mechanics.Ataque;
import style.Estilo;
import weapon.Arma;

public abstract class DecoratorArmadura extends Personagem{

	private Personagem componete;

	public DecoratorArmadura(Personagem p){
		componete = p;
	}

	@Override
	public Estilo getEstilo() {
		return componete.getEstilo();
	}

	@Override
	public Arma getArma() {
		return componete.getArma();
	}

	@Override
	public Ataque getAtaque() {
		return componete.getAtaque();
	}

	@Override
	public int getPv() {
		return componete.getPv() + super.getPv();
	}

	@Override
	public String getArmadura() {

		if(componete.getArmadura().isEmpty()){
			return super.getArmadura();
		}

		return componete.getArmadura() + ", "+super.getArmadura();
	}

	@Override
	public int getMp() {
		return componete.getMp();
	}

	@Override
	public String getNome() {
		return componete.getNome();
	}

	@Override
	public String getDescricao() {
		return componete.getDescricao();
	}

	@Override
	public int getNivel() {
		return componete.getNivel();
	}
}

package armor;

import entity.*;
import mechanics.attacksArmas.AtaquePersonagem;
import mechanics.spells.Feitico;
import style.Estilo;
import weapon.Arma;

public abstract class DecoratorArmadura extends Personagem{

	private Personagem componete;

	public DecoratorArmadura(Personagem p){
		componete = p;
	}

	@Override
	public void executarAtaque(Inimigo inimigo) {
		componete.executarAtaque(inimigo);
	}

	@Override
	public void lancarFeitico(Entidade entidade) {
		componete.lancarFeitico(entidade);
	}

	@Override
	public void setArma(Arma arma) {
		componete.setArma(arma);
	}

	@Override
	public void setFeitico(Feitico feitico) {
		componete.setFeitico(feitico);
	}

	@Override
	public void setAtaque(AtaquePersonagem ataquePersonagem) {
		componete.setAtaque(ataquePersonagem);
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
	public AtaquePersonagem getAtaque() {
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

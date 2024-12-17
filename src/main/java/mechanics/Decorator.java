package mechanics;

import armor.capacetes.Elmo;
import armor.luvas.Luvas;
import armor.peitorais.Peitoral;
import armor.pernas.Pernas;
import entity.*;

public abstract class Decorator extends Personagem{

	private Elmo elmo;
	private Luvas luvas;
	private Peitoral peito;
	private Pernas pernas;
	
	public Decorator(Elmo elmo, Luvas luvas, Peitoral peito, Pernas pernas) {
		this.elmo = elmo;
		this.luvas = luvas;
		this.peito = peito;
		this.pernas = pernas;
	}
	
	@Override
	public int getPv() {
		return elmo.getDefesa() + luvas.getDefesa() + peito.getDefesa() + pernas.getDefesa() + super.getPv();
	}
	
	@Override
	public String getNome() {
		return super.getNome() + "usando" + elmo.getNome() + ", " + luvas.getNome() + ", " + peito.getNome() + ", " + pernas.getNome(); 
	}
	
}

package armor.pernas;

import armor.Armadura;

public abstract class Pernas extends Armadura{
	public Pernas() {
		setTipo("Pernas");
	}
	
	@Override
	public void status() {
		System.out.println("Nome: "+getNome());
		System.out.println("Tipo: "+getTipo());
		System.out.println("Descrição: "+getDescricao());
		System.out.println("Defesa: "+getDefesa());			
	}

}
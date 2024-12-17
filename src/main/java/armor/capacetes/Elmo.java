package armor.capacetes;

import armor.Armadura;

public abstract class Elmo extends Armadura{
	public Elmo() {
		setTipo("Elmo");
	}
	
	@Override
	public void status() {
		System.out.println("Nome: "+getNome());
		System.out.println("Tipo: "+getTipo());
		System.out.println("Descrição: "+getDescricao());
		System.out.println("Defesa: "+getDefesa());			
	}

}

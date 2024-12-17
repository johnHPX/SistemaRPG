package armor.luvas;

import armor.Armadura;

public abstract class Luvas extends Armadura{
	public Luvas() {
		setTipo("Luvas");
	}
	
	@Override
	public void status() {
		System.out.println("Nome: "+getNome());
		System.out.println("Tipo: "+getTipo());
		System.out.println("Descrição: "+getDescricao());
		System.out.println("Defesa: "+getDefesa());			
	}

}

package armor.peitorais;

import armor.Armadura;

public abstract class Peitoral extends Armadura{
	public Peitoral() {
		setTipo("Peitoral");
	}
	
	@Override
	public void status() {
		System.out.println("Nome: "+getNome());
		System.out.println("Tipo: "+getTipo());
		System.out.println("Descrição: "+getDescricao());
		System.out.println("Defesa: "+getDefesa());			
	}

}

package armor.peitorais;

public class ArmaduraDeSmough extends Peitoral{
	
	private int defesa;
	private String especialidade;
	
	public ArmaduraDeSmough() {
		setNome("ArmaduraDeSmough");
		setDefesa(40);
		setDescricao("Armadura extremamente pesada de um carrasco de uma terra distante");
		setEspecialidade("Incrível resistência física e elétrica");
		setNivel(5);
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
}
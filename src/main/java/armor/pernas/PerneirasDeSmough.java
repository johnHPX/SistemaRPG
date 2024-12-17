package armor.pernas;

public class PerneirasDeSmough extends Pernas{

	private int defesa;
	private String especialidade;
	
	public PerneirasDeSmough() {
		setNome("PerneirasDeSmough");
		setDefesa(38);
		setDescricao("Perneiras extremamente pesadas de um carrasco de uma terra distante");
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
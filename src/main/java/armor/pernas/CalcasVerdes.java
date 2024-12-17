package armor.pernas;

public class CalcasVerdes extends Pernas{

	private int defesa;
	private String especialidade;
	
	public CalcasVerdes() {
		setNome("CalcasVerdes");
		setDefesa(15);
		setDescricao("Calças verdes de tecido reforçado");
		setEspecialidade("Dá mais coragem para quem estiver usando");
		setNivel(2);
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
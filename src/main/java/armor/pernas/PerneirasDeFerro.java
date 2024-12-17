package armor.pernas;

public class PerneirasDeFerro extends Pernas{

	private int defesa;
	private String especialidade;
	
	public PerneirasDeFerro() {
		setNome("PerneirasDeFerro");
		setDefesa(23);
		setDescricao("Perneiras pesadas de ferro");
		setEspecialidade("Defende bem contra fogo");
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
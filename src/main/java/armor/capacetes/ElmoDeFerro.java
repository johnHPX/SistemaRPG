package armor.capacetes;

public class ElmoDeFerro extends Elmo{

	private int defesa;
	private String especialidade;
	
	public ElmoDeFerro() {
		setNome("ElmoDeFerro");
		setDefesa(12);
		setDescricao("Elmo comum de ferro");
		setEspecialidade("Defende bem contra Fogo");
		setNivel(1);
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

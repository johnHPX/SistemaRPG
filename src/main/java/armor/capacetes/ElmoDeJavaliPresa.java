package armor.capacetes;

public class ElmoDeJavaliPresa extends Elmo{

	private int defesa;
	private String especialidade;
	
	public ElmoDeJavaliPresa() {
		setNome("ElmoDeJavaliPresa");
		setDefesa(30);
		setDescricao("Elmo de aço pesado com o formato da cabeça de um javali");
		setEspecialidade("Defende bem contra Ataque Físico");
		setNivel(4);
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
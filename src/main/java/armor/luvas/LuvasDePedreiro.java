package armor.luvas;

public class LuvasDePedreiro extends Luvas{
	
	private int defesa;
	private String especialidade;
	
	public LuvasDePedreiro() {
		setNome("LuvasDePedreiro");
		setDefesa(8);
		setDescricao("Luvas extraordinárias de um antigo Semideus");
		setEspecialidade("Receba ataques e devolva-os");
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
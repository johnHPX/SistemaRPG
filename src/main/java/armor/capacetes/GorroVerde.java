package armor.capacetes;

public class GorroVerde extends Elmo{

	private int defesa;
	private String especialidade;
	
	public GorroVerde() {
		setNome("GorroVerde");
		setDefesa(10);
		setDescricao("Um gorro verde longo e pontudo");
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
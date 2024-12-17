package armor.luvas;

public class LuvasDeFerro extends Luvas{
	
	private int defesa;
	private String especialidade;
	
	public LuvasDeFerro() {
		setNome("LuvasDeFerro");
		setDefesa(8);
		setDescricao("Luvas pesadas de ferro");
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
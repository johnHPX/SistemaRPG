package armor.luvas;

public class LuvasDeFeiticeira extends Luvas{
	
	private int defesa;
	private String especialidade;
	
	public LuvasDeFeiticeira() {
		setNome("LuvasDeFeiticeira");
		setDefesa(4);
		setDescricao("Luvas roxas de uma antiga feitiçeira");
		setEspecialidade("Defende bem contra Morte");
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


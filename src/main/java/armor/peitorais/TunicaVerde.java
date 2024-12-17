package armor.peitorais;

public class TunicaVerde extends Peitoral{
	
	private int defesa;
	private String especialidade;
	
	public TunicaVerde() {
		setNome("TunicaVerde");
		setDefesa(13);
		setDescricao("Uma tûnica verde de tecido reforçado");
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
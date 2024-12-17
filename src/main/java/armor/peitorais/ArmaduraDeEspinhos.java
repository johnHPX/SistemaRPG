package armor.peitorais;

public class ArmaduraDeEspinhos extends Peitoral{
	
	private int defesa;
	private String especialidade;
	
	public ArmaduraDeEspinhos() {
		setNome("ArmaduraDeEspinhos");
		setDefesa(19);
		setDescricao("Armadura com espinhos tortos de metal em volta");
		setEspecialidade("Dê dano adicional aos inimigos que você atacar ou que te atacarem");
		setNivel(3);
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
package entidades;

public abstract class Personagem {

	// AS CARACTERÍSTICAS DOS PERSONAGENS
	protected String historia;
	protected String nome;
	protected Classes classe;
	protected Integer hp;
	protected Integer dano;
	
	public Personagem() {
		
	}
	
	// CONSTRUTOR COM ARGUMENTOS POIS O PERSONAGEM NÃO PODE TER VALOR NULO
	public Personagem(String historia, String nome, Classes classe, Integer hp, Integer dano) {
		this.historia = historia;
		this.nome = nome;
		this.classe = classe;
		this.hp = hp;
		this.dano = dano;
	}

	// METODO PARA USAR AS VARIAVEIS FORA DA SUA CLASSE PRINCIPAL
	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Classes getClase() {
		return classe;
	}

	public void setClase(Classes clase) {
		this.classe = clase;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getDano() {
		return dano;
	}

	public void setDano(Integer dano) {
		this.dano = dano;
	}

	
	public abstract String toString();
		
	



		
	

	

	
	
	
}

package entidades;

public  class Mago extends Personagem implements Iacoes {

	// ESSAS SÃO AS CARTERISTICAS DA CLASSE MAGO
	private Integer mana;
	private Integer PoderMagico;

	public Mago() {

	}

	public Mago(String historia, String nome, Classes classe, Integer hp, Integer dano, Integer mana,
			Integer poderMagico) {
		super(historia, nome, classe, hp, dano);
		this.mana = mana;
		this.PoderMagico = poderMagico;
	}

	public Integer getMana() {
		return mana;
	}

	public void setMana(Integer mana) {
		this.mana = mana;
	}

	public Integer getPoderMagico() {
		return PoderMagico;
	}

	public void setPoderMagico(Integer poderMagico) {
		PoderMagico = poderMagico;
	}

	@Override
	public void curar() {
		if (mana >= 30) {
			mana -= 50;
      System.out.println("Voce gastou 50 de mana para se cura e ficou com " + mana + " de mana\n"
					+ "\"===Cura realizada===\"");


		} else {
			System.out.println("mana insuficinete para realizar a cura");
		}

	}

	@Override
	public void TomarDano() {
		if (hp > dano) {
			hp = -dano;
			System.out.println("Voce tomou dano de um inimigo\n" + "vida tual: " + hp); 
		} else {
			hp = -dano;
			System.out.println("Voce tomou " + dano + " e morreu");

		}

	}

	@Override
	public void Status() {
		System.out.println("Status atuais" + "\nVida: " + hp + "\nMana: " + mana + "\nPoder de magico: " + PoderMagico);

	}

	// AQUI UMA CLASSE STRING PARA "ANUNCIAR" QUE SEU PERSONAGEM FOI CRIADO

	@Override
	public String toString() {
		return "PARABENS POR CRIAR SEU PERSONAGEM, ESSE É QUEM VOCÊ É:\n" + "seu nome é " + nome
				+ " e essa é sua historia ===//\n" + historia + "\\=== \n Voce é da classe " + classe + "\ne tem"
				+ " as seguintes características " + hp + " pontos de vida e \n" + dano + " poder de ataque " + mana
				+ " pontos de mana, e tem " + PoderMagico + " de poder magico";

	}

}

/*
Aluno: Carlos Eduardo Martins Ferreira RA: 2576163
*/

public class Cadastro{
	float preco = 0;
	String codigo_barras = "";
	boolean disponivel;

	public float getPreco() {
		return preco;
	}

	public String getCodigoBarras() {
		return codigo_barras;
	}

	public boolean getDisponivel() {
		return disponivel;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void setCodigoBarras(String codigo_barras) {
		this.codigo_barras = codigo_barras;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

}
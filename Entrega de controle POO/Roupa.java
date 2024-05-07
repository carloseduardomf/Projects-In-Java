/*
Aluno: Carlos Eduardo Martins Ferreira RA: 2576163
*/

public abstract class Roupa{

	private int tamanho;
	private String cor;
	private String marca;
	private Cadastro cadastro;


//	public abstract void impDados();

	
	public Roupa(){
		tamanho = 0;
		cor = "";
		marca = "";
		cadastro = new Cadastro();
	}

	public Roupa(int tamanho, String cor, String marca,Cadastro cadastro){
		this.tamanho = tamanho;
		this.cor = cor;
		this.marca = marca;
		this.cadastro = cadastro;
	}


	public Cadastro getCadastro(){
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro){
		this.cadastro = cadastro;
	}



	public int getTamanho(){
		return tamanho;
	}

	public void setTamanho(int tamanho){
		this.tamanho = tamanho;
	}



	public String getCor(){
		return cor;
	}
	
	public void setCor(String cor){
		this.cor = cor;
	}



	public String getMarca(){
		return marca;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}

}


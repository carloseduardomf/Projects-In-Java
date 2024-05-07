/*
Aluno: Carlos Eduardo Martins Ferreira RA: 2576163
*/

public class TstLoja extends Menu{

	public static void main(String [] arg){ 

	   	Leitura l = new Leitura();
		Menu menu = new Menu();

		
		do{
			menu.escolhas();
			menu.setAux(Integer.parseInt(l.entDados("Escolha uma opção:")));
			switch(menu.getAux()){
				
				//Camisa:
				case 1:
					
					Camisa cms1 = new Camisa();
					System.out.println("\nRegistro:\n");
					//Roupa:
					cms1.setCor(l.entDados("Cor:"));
					cms1.setMarca(l.entDados("Marca:"));
          				cms1.setTamanho(Integer.parseInt(l.entDados("Tamanho:")));
          				//Cadastro:
					cms1.getCadastro().setCodigoBarras(l.entDados("Código de barras:"));
					cms1.getCadastro().setPreco(Float.parseFloat(l.entDados("Preço:")));
					//Camisa:
					cms1.setColarinho(l.entDados("Colarinho:"));
					cms1.setManga(l.entDados("Manga:"));
					
					System.out.println("\n\nResultado:\n");
					//Roupa
            				System.out.println("Cor: "+cms1.getCor());
            				System.out.println("Marca: "+cms1.getMarca());
            				System.out.println("Tamanho.: "+cms1.getTamanho());
					//Cadastro:
            				System.out.println("Código de barras: "+cms1.getCadastro().getCodigoBarras());
            				System.out.println("Preço: "+cms1.getCadastro().getPreco());
					//Camisa:
					System.out.println("Colarinho: "+cms1.getColarinho());
					System.out.println("Manga: "+cms1.getManga());
					
				break;

				//Calca
				case 2:
					Calca clc1 = new Calca();
					System.out.println("\nRegistro:\n");
					//Roupa:
					clc1.setCor(l.entDados("Cor:"));
					clc1.setMarca(l.entDados("Marca:"));
          				clc1.setTamanho(Integer.parseInt(l.entDados("Tamanho:")));
          				//Cadastro:
					clc1.getCadastro().setCodigoBarras(l.entDados("Código de barras:"));
					clc1.getCadastro().setPreco(Float.parseFloat(l.entDados("Preço:")));
					//Calça:
					clc1.setNumeroBolsos(Integer.parseInt(l.entDados("Número de bolsos:")));
					clc1.setModelagem(l.entDados("Modelagem:"));
					
					System.out.println("\n\nResultado:\n");
					//Roupa
            				System.out.println("Cor: "+clc1.getCor());
            				System.out.println("Marca: "+clc1.getMarca());
            				System.out.println("Tamanho.: "+clc1.getTamanho());
					//Cadastro:
            				System.out.println("Código de barras: "+clc1.getCadastro().getCodigoBarras());
            				System.out.println("Preço: "+clc1.getCadastro().getPreco());
					//Calça:
					System.out.println("Número de bolsos: "+clc1.getNumeroBolsos());
					System.out.println("Modelagem: "+clc1.getModelagem());

				break;

				//Vestido
				case 3:
					Vestido v1 = new Vestido();
					System.out.println("\nRegistro:\n");
					//Roupa:
					v1.setCor(l.entDados("Cor:"));
					v1.setMarca(l.entDados("Marca:"));
          				v1.setTamanho(Integer.parseInt(l.entDados("Tamanho:")));
          				//Cadastro:
					v1.getCadastro().setCodigoBarras(l.entDados("Código de barras:"));
					v1.getCadastro().setPreco(Float.parseFloat(l.entDados("Preço:")));
					//Camisa:
					v1.setOcasiao(l.entDados("Ocasião:"));
					v1.setComprimento(Integer.parseInt(l.entDados("Comprimento:")));
					
					System.out.println("\n\nResultado:\n");
					//Roupa
            				System.out.println("Cor: "+v1.getCor());
            				System.out.println("Marca: "+v1.getMarca());
            				System.out.println("Tamanho.: "+v1.getTamanho());
					//Cadastro:
            				System.out.println("Código de barras: "+v1.getCadastro().getCodigoBarras());
            				System.out.println("Preço: "+v1.getCadastro().getPreco());
					//Camisa:
					System.out.println("Ocasião: "+v1.getOcasiao());
					System.out.println("Conprimento: "+v1.getComprimento());
				break;

				case 0:
					System.out.println("Adeus!!");
				break;

				default:
					System.out.println("\nOpção inválida!");
			}

		}while(menu.getAux() != 0);
		
	   	          
		
		

	}

}

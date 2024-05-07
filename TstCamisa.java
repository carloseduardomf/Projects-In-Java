/*
Aluno: Carlos Eduardo Martins Ferreira RA: 2576163
*/

public class TstCamisa{

	public static void main(String [] arg){ 

	   	Leitura l = new Leitura();
		
		int aux = 0;

		Menu();
		do{

			switch(aux){
				
				//Camisa:
				case 1:
					Camisa cms1 = new Camisa();
					
				break;

				//Calca
				case 2:
					Calca clc1 = new Calca();
					
				break;

				//Vestido
				case 3:
					Vestido v1 = new Vestido();
					
				break;
				default:
					System.out.println("\nOpção inválida!");
					aux = 0;
			}

		}while(aux==0);
		
	   	          
		
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

	}

}

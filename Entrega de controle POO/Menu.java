public class Menu{
	
	private int aux = 0;

	public void escolhas(){
		System.out.println("\n\nMenu:");
		System.out.println("1 - Camisa");
		System.out.println("2 - Calça");
		System.out.println("3 - Vestido");
		System.out.println("0 - Sair");
	}

	public int getAux(){
		return aux;
	}

	public void setAux(int aux){
		this.aux = aux;
	}
}
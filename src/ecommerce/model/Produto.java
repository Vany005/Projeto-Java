package ecommerce.model;

public abstract class Produto {
	
	private String Produto;
	private int ID;
	private float cupom;
	private int categoria;
	public Produto(String produto, int iD, float cupom, int categoria) {
		Produto = produto;
		ID = iD;
		this.cupom = cupom;
		this.categoria = categoria;
	}
	public String getProduto() {
		return Produto;
	}
	public void setProduto(String produto) {
		Produto = produto;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public float getCupom() {
		return cupom;
	}
	public void setCupom(float cupom) {
		this.cupom = cupom;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	public void visualizar() {
		String categoria= "";
		
		switch(this.categoria) {
		case 1:
			categoria = "Roupa Masculina";
			break;
		case 2:
			categoria = "Roupa Feminina";
			break;
				
		} System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Produto" + this.Produto);
		System.out.println("Cupom: " + this.cupom);
		System.out.println("Categoria: " +this. categoria);
		System.out.println("ID " + this.ID);
		

	}

}

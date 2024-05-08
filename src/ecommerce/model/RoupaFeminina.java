package ecommerce.model;

public class RoupaFeminina extends Produto {
	private String babytee;
	
	public  RoupaFeminina(String produto, int iD, float cupom, int categoria, String babytee) {
		super(produto, iD, cupom, categoria);
		this.babytee = babytee;
		
	
	}

	public String getBabytee() {
		return babytee;
	}

	public void setBabytee(String babytee) {
		this.babytee = babytee;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\nBaby tee" + this.babytee);
		
	}
		
	

}

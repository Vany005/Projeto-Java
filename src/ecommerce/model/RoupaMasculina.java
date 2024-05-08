package ecommerce.model;

public class RoupaMasculina extends Produto{
	private String bolso;
	
	public RoupaMasculina(String produto, int iD, float cupom, int categoria, String bolso) {
		super(produto, iD, cupom, categoria);
		this.bolso = bolso;
				
	}

	public String getBolso() {
		return bolso;
	}

	public void setBolso(String bolso) {
		this.bolso = bolso;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\nBolso" + this.bolso);
} 

}
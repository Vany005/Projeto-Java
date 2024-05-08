package ecommerce.repository;

import ecommerce.model.Produto;

public interface EcommerceRepository {
	//CRUD do Produto
	public void Cadastrar(Produto produto); 
	public void ListarProduto();
	public void buscaID( int ID);                       
	public void Deletar(int ID);                  
	public void Cupons(float cupom);
	public void Categoria(int categoria);
	
}

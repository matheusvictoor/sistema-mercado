package repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import model.Produto;

public class ProdutoRepository {

	private Map<Integer, Produto> produtos;
	
	public ProdutoRepository() {
		this.produtos = new HashMap<Integer, Produto>();
	}
	
	public void salvar(Produto produto) {
		this.produtos.put(produto.getId(), produto);
	}
	
	public void atualiza(Produto produto) {
		this.produtos.put(produto.getId(), produto);
	}
	
	public void deletar(Produto produto) {
		this.produtos.remove(produto);
	}
	
	public Produto buscarPorId(int id) {
		return produtos.get(id);
	}
	
	public List<Produto> buscaTodos(){
		List<Produto> prod = new ArrayList<>();
		
		for(Entry<Integer, Produto> entrada: produtos.entrySet()) {
			prod.add(entrada.getValue());
		}
		return prod;
	}
}

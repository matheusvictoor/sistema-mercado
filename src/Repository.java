import java.util.HashMap;
import java.util.Map;

public class Repository {

	private Map<Integer, Produto> produtos;
	private Map<Integer, Lote> lotes;
	
	public Repository() {
		this.produtos = new HashMap<Integer, Produto>();
		this.lotes = new HashMap<Integer, Lote>();
	}
	
	public void addProduto(Produto produto) {
		this.produtos.put(produto.getId(), produto);
	}
	
	public void addLote(Lote lote) {
		this.lotes.put(lote.getIdProduto(), lote);
	}
}

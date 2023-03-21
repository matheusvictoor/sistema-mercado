package repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import model.Lote;
import model.Produto;

public class LoteRepository {

	private Map<Integer, Lote> lotes;
	
	public LoteRepository() {
		this.lotes = new HashMap<Integer, Lote>();
	}
	
	public void salvar(Lote lote) {
		this.lotes.put(lote.getId(), lote);
	}
	
	public void atualiza(Lote lote) {
		this.lotes.put(lote.getId(), lote);
	}
	
	public void deletar(Produto lote) {
		this.lotes.remove(lote);
	}
	
	public Lote buscarPorId(int id) {
		return lotes.get(id);
	}
	
	public List<Lote> buscaTodos(){
		List<Lote> lote = new ArrayList<>();
		
		for(Entry<Integer, Lote> entrada: lotes.entrySet()) {
			lote.add(entrada.getValue());
		}
		return lote;
	}

}


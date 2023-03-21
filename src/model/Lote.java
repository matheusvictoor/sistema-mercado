package model;

import java.sql.Date;

public class Lote {
	
	private int id;
	private Produto produto;
	private Date dataValidade;
	
	public Lote(int id, Produto produto, Date dataValidade) {
		this.id = id;
		this.produto = produto;
		this.dataValidade = dataValidade;
	}
	
	public int getId() {
		return id;
	}

	public Produto getProduto() {
		return produto;
	}
	
	public int getIdProduto() {
		return produto.getId();
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	@Override
	public String toString() {
		return "Lote: " + this.id + " produto: " + this.produto.getNome() + " dataValidade: " + this.dataValidade;
	}	
}

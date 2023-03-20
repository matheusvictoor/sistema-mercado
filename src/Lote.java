import java.sql.Date;

public class Lote {
	
	private Produto produto;
	private Date dataValidade;
	
	public Lote(Produto produto, Date dataValidade) {
		this.produto = produto;
		this.dataValidade = dataValidade;
	}

	public Produto getProduto() {
		return produto;
	}
	
	public int getIdProduto() {
		return produto.getId();
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}	
}

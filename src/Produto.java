
public class Produto {
	
	private int id;
	private String nome;
	private String fabricante;
	private double preco;
	
	public Produto(String nome, String fabricante, double preco) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.preco = preco;
	}
	
	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public String getFabricante() {
		return this.fabricante;
	}

	public double getPreco() {
		return this.preco;
	}

	@Override
	public String toString() {
		return "Produto: " + this.nome + " fabricante: " + this.fabricante + " preco: " + this.preco;
	}
}

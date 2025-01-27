package entities;

public class ProdutoImportado extends Produto {
	private Double txAlfandega;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double txAlfandega) {
		super(nome, preco);
		this.txAlfandega = txAlfandega;
	}

	public Double getTxAlfandega() {
		return txAlfandega;
	}

	public void setTxAlfandega(Double txAlfandega) {
		this.txAlfandega = txAlfandega;
	}
	
	public Double precoTotal() {
		return getPreco() + txAlfandega;
	}

	@Override
	public String etqPreco() {
		return getNome()
				+ " R$ " 
				+ String.format("%.2f", precoTotal())
				+ " (taxa de importação: R$ " 
				+ String.format("%.2f", txAlfandega)
				+ ")";
	}
	
	
	
}

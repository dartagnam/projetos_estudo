package entities;

public class Juridica extends Contribuinte {
	public Integer numEmpregados;

	public Juridica() {
		super();
	}

	public Juridica(String nome, Double rendaAnual, Integer numEmpregados) {
		super(nome, rendaAnual);
		this.numEmpregados = numEmpregados;
	}

	@Override
	public Double imposto() {
		if(numEmpregados > 10) {
			return getRendaAnual() * 0.14;
		} else {
			return getRendaAnual() * 0.16;
		}
	}
	
	

}

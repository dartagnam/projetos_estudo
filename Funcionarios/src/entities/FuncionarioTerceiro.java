package entities;

public class FuncionarioTerceiro extends Funcionario {
	private Double custoAdicional;

	public FuncionarioTerceiro() {
		super();
	}

	public FuncionarioTerceiro(String nome, Integer horas, Double vlrHora, Double custoAdicional) {
		super(nome, horas, vlrHora);
		this.custoAdicional = custoAdicional;
	}

	public Double getCustoAdicional() {
		return custoAdicional;
	}

	public void setCustoAdicional(Double custoAdicional) {
		this.custoAdicional = custoAdicional;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + custoAdicional * 1.1;
	}
	
	
	
}

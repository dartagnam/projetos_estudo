package entities;

public class Fisica extends Contribuinte{
	public Double dspSaude;

	public Fisica() {
		super();
	}

	public Fisica(String nome, Double rendaAnual, Double dspSaude) {
		super(nome, rendaAnual);
		this.dspSaude = dspSaude;
	}

	@Override
	public Double imposto() {
		if (getRendaAnual() < 20000.0) {
			return getRendaAnual() * 0.15 - dspSaude * 0.5;
		} else {
			return getRendaAnual() * 0.25 - dspSaude * 0.5;
		}
	}
		
}

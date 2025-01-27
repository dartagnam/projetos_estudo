package entities;

public class Funcionario {
	private String nome;
	private Integer horas;
	private Double vlrHora;
	
	public Funcionario() {
	}

	public Funcionario(String nome, Integer horas, Double vlrHora) {
		this.nome = nome;
		this.horas = horas;
		this.vlrHora = vlrHora;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getVlrHora() {
		return vlrHora;
	}

	public void setVlrHora(Double vlrHora) {
		this.vlrHora = vlrHora;
	}

	public double pagamento() {
		return horas * vlrHora;
	}
		
}

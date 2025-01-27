package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enuns.NivelFuncionario;

public class Funcionarios {
	private String nome;
	private NivelFuncionario nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<ContratoHr> contratos = new ArrayList<>();
	
	public Funcionarios() {
		
	}

	public Funcionarios(String nome, NivelFuncionario nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelFuncionario getNivel() {
		return nivel;
	}

	public void setNivel(NivelFuncionario nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHr> getContratos() {
		return contratos;
	}
	
	public void addContrato(ContratoHr contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(ContratoHr contrato) {
		contratos.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for(ContratoHr c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
	
	
	
	
	
	
}

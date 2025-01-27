package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date dtnascimento;
	
	public Cliente() {

	}

	public Cliente(String nome, String email, Date dtnascimento) {
		this.nome = nome;
		this.email = email;
		this.dtnascimento = dtnascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDtnascimento() {
		return dtnascimento;
	}

	public void setDtnascimento(Date dtnascimento) {
		this.dtnascimento = dtnascimento;
	}
	
	public String toString() {
		return nome + " (" + sdf.format(dtnascimento) + ") - " + email;
 	}	
}

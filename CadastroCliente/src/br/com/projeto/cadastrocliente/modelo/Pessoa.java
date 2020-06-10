package br.com.projeto.cadastrocliente.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String email;
	private boolean cliente;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public boolean isCliente() {
		return cliente;
	}
	public void setCliente(boolean cliente) {
		this.cliente = cliente;
	}
	
	
}

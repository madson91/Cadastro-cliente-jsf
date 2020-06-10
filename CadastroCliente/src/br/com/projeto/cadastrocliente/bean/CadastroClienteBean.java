package br.com.projeto.cadastrocliente.bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;

import br.com.projeto.cadastrocliente.dao.PessoaDao;
import br.com.projeto.cadastrocliente.modelo.Pessoa;

@ManagedBean
public class CadastroClienteBean {
	
	private Pessoa cliente = new Pessoa();
	
	public void addCliente() {
		
		PessoaDao dao = new PessoaDao();
		cliente.setCliente(true);
		cliente.setDataCadastro(new Date());
		dao.adiciona(this.cliente);
	}
	
	public Pessoa getCliente() {
		return this.cliente;
	}
	

}

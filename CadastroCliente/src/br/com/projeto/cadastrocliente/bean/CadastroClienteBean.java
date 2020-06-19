package br.com.projeto.cadastrocliente.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.projeto.cadastrocliente.dao.PessoaDao;
import br.com.projeto.cadastrocliente.modelo.Pessoa;

@ManagedBean(name = "cadastroClienteBean")
public class CadastroClienteBean {

	private Pessoa cliente = new Pessoa();
	private List<Pessoa> lista;

	public Pessoa getCliente() {
		return this.cliente;
	}

	public void addCliente() {

		PessoaDao dao = new PessoaDao();
		cliente.setCliente(true);
		dao.adiciona(this.cliente);
		this.cliente = new Pessoa();
		FacesContext.getCurrentInstance().addMessage("sucesso", new FacesMessage("Cliente cadastrado com sucesso!") );

	}

	public List<Pessoa> getClientes() {

		PessoaDao dao = new PessoaDao();
		if(lista == null)
			lista =  dao.listaTodos();
		return lista;

	}

}



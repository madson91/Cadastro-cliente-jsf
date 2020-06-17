package br.com.projeto.cadastrocliente.bean;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import br.com.projeto.cadastrocliente.dao.PessoaDao;
import br.com.projeto.cadastrocliente.modelo.Pessoa;

@ManagedBean(name = "cadastroClienteBean")
public class CadastroClienteBean {

	private Pessoa cliente = new Pessoa();

	public Pessoa getCliente() {
		return this.cliente;
	}

	public void addCliente() {

		PessoaDao dao = new PessoaDao();
		cliente.setCliente(true);
		//		cliente.setDataCadastro(new Date());
		dao.adiciona(this.cliente);
		this.cliente = new Pessoa();
		FacesContext.getCurrentInstance().addMessage("sucesso", new FacesMessage("Cliente cadastrado com sucesso!") );

	}

	public List<Pessoa> getClientes() {
		PessoaDao dao = new PessoaDao();
		return dao.listaTodos();

	}

	public void validadorEmail() throws ValidatorException {

		if (this.cliente.getEmail() != null && this.cliente.getEmail().length() > 0) {
			String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(cliente.getEmail());
			if (matcher.matches()) {
				//email incorreto
				throw new ValidatorException(new FacesMessage("Email incorreto!"));
			}
		}

	}

}



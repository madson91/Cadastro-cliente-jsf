package br.com.projeto.cadastrocliente.bean;

import javax.persistence.EntityManager;

import br.com.projeto.cadastrocliente.dao.JPAUtil;
import br.com.projeto.cadastrocliente.modelo.Pessoa;

public class Teste {

	public static void main(String[] args) {


		Pessoa cliente = new Pessoa();
		cliente.setCliente(true);
		cliente.setNome("madson");
		cliente.setEmail("teste@teste");
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		System.out.println("deu certo");
	}

}

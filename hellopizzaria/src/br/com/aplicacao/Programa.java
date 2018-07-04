package br.com.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.internal.StaticFilterAliasGenerator;

import br.com.cadastro.CadastroCliente;

public class Programa {
	public static void main(String[] args) {
		
	
	CadastroCliente p1 = new CadastroCliente(null, "Carlos da Silva", "carlos@gmail.com","m","(34)99112-3231","rua pedro alves",232,null,"centro","Uberlandia");
	CadastroCliente p2 = new CadastroCliente(null, "Rafaela da Silva", "rafaela@gmail.com","f","(34)99112-3231","rua pedro alves",232,null,"centro","Uberlandia");
	CadastroCliente p3 = new CadastroCliente(null, "Junior da Silva", "junior@gmail.com","m","(34)99112-3231","rua pedro alves",232,null,"centro","Uberlandia");
	CadastroCliente p4 = new CadastroCliente(null, "Rafinha da Silva", "rafaela@gmail.com","f","(34)99112-3231","rua pedro alves",232,null,"centro","Uberlandia");
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	em.persist(p1);
	em.persist(p2);
	em.persist(p3);
	em.persist(p4);
	em.getTransaction().commit();
	System.out.println("Pronto");
	}
}
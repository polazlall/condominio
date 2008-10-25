package br.uniminas.persistencia;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import br.uniminas.entidades.HibernateUtil;
import br.uniminas.entidades.Pessoa;

public class PessoaHibernateDAO implements PessoaDAO {
	private List<Pessoa> pesList;

	private Pessoa pes;

	private Session session = HibernateUtil.getSessionFactory()
			.getCurrentSession();

	public List getAllPessoas() {
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			pesList = session.createQuery("from Pessoa").list();
			return pesList;
		} finally {
			// session.close();
		}
	}

	public br.uniminas.entidades.Pessoa getPessoa(String id) {
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			Query q = session.createQuery("from Pessoa where P_cpf=:P_cpf");
			q.setString("P_cpf", id);
			return (Pessoa) q.uniqueResult();
		} finally {
			// session.close();
		}
	}

	public void insert(Pessoa pes) {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(pes);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			// session.close();
		}
	}

	public void delete(String id) {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			pes = (Pessoa) session.get(Pessoa.class, id);
			session.delete(pes);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {

		}
	}

	public Pessoa pesquisarPessoa(String encontra) {

		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			pes = (Pessoa) session.load(Pessoa.class, encontra);
			return pes;
		} finally {

		}
	}
}

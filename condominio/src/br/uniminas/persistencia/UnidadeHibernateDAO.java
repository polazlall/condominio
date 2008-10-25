package br.uniminas.persistencia;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import br.uniminas.entidades.Unidade;

public class UnidadeHibernateDAO implements UnidadeDAO {
	private List<Unidade> uniList;

	private Unidade u;

	private Session session = HibernateUtil.getSessionFactory()
			.getCurrentSession();

	public List getAllUnidades() {
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			uniList = session.createQuery("from Unidade").list();
			return uniList;
		} catch (HibernateException e) {
			throw e;
		} finally {
		}
	}

	public br.uniminas.entidades.Unidade getUnidade(String id) {
		session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			Query q = session
					.createQuery("from unidade where P_numero =:P_numero");
			q.setString("P_numero", id);
			return (br.uniminas.entidades.Unidade) q.uniqueResult();
		} finally {

		}
	}

	public void updateUnidade(Unidade u) {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.update(u);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
		}
	}

	public void delete(String id) {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			u = (Unidade) session.get(Unidade.class, id);
			session.delete(u);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {

		}
	}

}

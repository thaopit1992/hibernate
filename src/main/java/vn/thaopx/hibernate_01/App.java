package vn.thaopx.hibernate_01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import model.*;
import utils.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			if (sessionFactory != null) {
				Session session = sessionFactory.openSession();
				try {
					Transaction tr = session.beginTransaction();
					Cat cat1 = new Cat();
					cat1.setName("Tom");
					cat1.setSex(true);
					session.save(cat1);
					tr.commit();
				} finally {
					session.close();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

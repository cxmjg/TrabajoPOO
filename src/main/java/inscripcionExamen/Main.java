
package inscripcionExamen;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// Configuración de Hibernate
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		cfg.setProperty(null, null);

		// Guardar la persona en la base de datos
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			Usuario usuario = session.createQuery("FROM Usuario WHERE id = :id", Usuario.class).setParameter("id", 1)
					.uniqueResult();
			System.out.println("Usuario: " + usuario.getNombre());

			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}
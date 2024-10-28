

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

        // Creo instancia
        
        Usuario usuario1 = new Usuario();
        Rol rol1 = new Rol();
        Mesa mesa1 = new Mesa();
        Materia materia1 = new Materia();
        InscripcionMateria inscripcionmateria1 = new InscripcionMateria();
        InscripcionExamen inscripcionexamen1 = new InscripcionExamen();
        Examen examen1 = new Examen();
        

        // Guardar la persona en la base de datos
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(usuario1);
            session.save(rol1);
            session.save(mesa1);
            session.save(materia1);
            session.save(inscripcionmateria1);
            session.save(inscripcionexamen1);
            session.save(examen1);

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

        System.out.println("¡TODO OK!");
    }
}
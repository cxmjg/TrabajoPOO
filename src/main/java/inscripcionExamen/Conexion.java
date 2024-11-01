package inscripcionExamen;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Conexion {
	Session session;
	Configuration cfg;
	Transaction transaction;
	
	public Conexion() {
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		cfg.setProperty(null, null);

		// Guardar la persona en la base de datos
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		
	}
	
	public Session getSession() {
		return this.session;
	}
	
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	
	public Usuario getUsuarioByEmail(String email) {
		return session.createQuery("FROM Usuario WHERE email = :email", Usuario.class).setParameter("email", email)
				.uniqueResult();
	}
	
	public Usuario getUsuarioById(int id) {
		return session.createQuery("FROM Usuario WHERE id = :id", Usuario.class).setParameter("id", id)
				.uniqueResult();
	}
	
	public List<InscripcionMateria> getInscripcionesMaterias(int idUsuario){
		return session.createQuery("FROM InscripcionMateria WHERE alumno_id = :idUsuario", InscripcionMateria.class).setParameter("idUsuario", idUsuario)
				.list();
	}
	
	public List<InscripcionExamen> getInscripcionesExamenes(int idUsuario){
		return session.createQuery("FROM InscripcionExamen WHERE alumno_id = :idUsuario", InscripcionExamen.class).setParameter("idUsuario", idUsuario)
				.list();
	}
	
	
	public void modificarNombreUsuario(int idUsuario, String nuevoNombre) {
		
	}
	
	public void modificarApellidoUsuario(int idUsuario, String nuevoNombre) {
		
	}
	
	public void modificarPasswordUsuario(int idUsuario, String nuevoNombre) {
		
	}
	
	public void modificarEmailUsuario(int idUsuario, String nuevoNombre) {
		
	}
	
	public void modificarRolUsuario(int idUsuario, String nuevoNombre) {
		
	}
	
}

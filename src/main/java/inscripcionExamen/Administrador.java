package inscripcionExamen;

import java.util.List;

public class Administrador implements InterfazUsuarios {

	@Override
	public void modificarUsuario(int idUsuario, String campo, String valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crearInscripcionMateria(int idUsuario, int idMateria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarInscripcionMateria(int idInscripcionMateria, String campo, String valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarInscripcionMateria(int idInscripcionmateria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crearInscripcionExamen(int idUsuario, int idExamen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarInscripcionExamen(int idInscripcionExamen, String campo, String valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarInscripcionExamen(int idInscripcionExamen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<InscripcionMateria> getInscripcionesMaterias(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InscripcionExamen> getInscripcionesExamenes(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Conexion getConexion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setConexion(Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

}

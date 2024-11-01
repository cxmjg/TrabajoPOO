package inscripcionExamen;

import java.util.List;

public interface InterfazUsuarios {
	public void modificarUsuario (int idUsuario, String campo, String valor);
	public void eliminarUsuario (int idUsuario);
	public void crearInscripcionMateria (int idUsuario, int idMateria);
	public void modificarInscripcionMateria (int idInscripcionMateria, String campo, String valor);
	public void eliminarInscripcionMateria (int idInscripcionmateria);
	public void crearInscripcionExamen (int idUsuario, int idExamen);
	public void modificarInscripcionExamen (int idInscripcionExamen, String campo, String valor);
	public void eliminarInscripcionExamen (int idInscripcionExamen);
	public List<InscripcionMateria> getInscripcionesMaterias(int idUsuario);
	public List<InscripcionExamen> getInscripcionesExamenes(int idUsuario);
	public Usuario getUsuario();
	public void setUsuario(Usuario usuario);
	public Conexion getConexion();
	public void setConexion(Conexion conexion);
}

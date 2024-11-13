
package inscripcionExamen; 

public class Main {

	public static void main(String[] args) {
		Conexion base = new Conexion();
		GUI interfaz = new GUI();
		Funcion funciones = new Funcion(interfaz, base);
		
		//Pantalla login
		interfaz.asignarAccionBtnLogin(funciones.login());
		interfaz.asignarAccionBtnGuardarNuevoUsuario(funciones.crearRegistro());
		
		//Interfaz principal
		interfaz.setAccionCambiarTab(funciones.completarTablas());
		
		//Tab Usuario
		interfaz.asignarAccionBtnModificarUsuario(funciones.completarDatosUsuarioSeleccionado());
		interfaz.asignarAccionBtnGuardarUsuario(funciones.guardarUsuario());
		interfaz.asignarAccionBtnDeshabilitarUsuario(funciones.deshabilitarUsuario());
		
		
		//Tab Mesa
		interfaz.asignarAccionBtnModificarMesa(funciones.completarDatosMesaSeleccionada());
		interfaz.asignarAccionBtnGuardarMesa(funciones.guardarMesa());
		interfaz.asignarAccionBtnEliminarMesa(funciones.deshabilitarMesa());
		
		//Tab Examen
		interfaz.asignarAccionBtnModificarExamen(funciones.completarDatosExamenSeleccionado());
		interfaz.asignarAccionBtnGuardarExamen(funciones.guardarExamen());
		interfaz.asignarAccionBtnEliminarExamen(funciones.deshabilitarExamen());
		
		//Tab Materia
		interfaz.asignarAccionBtnModificarMateria(funciones.completarDatosMateriaSeleccionada());
		interfaz.asignarAccionBtnGuardarMateria(funciones.guardarMateria());
		interfaz.asignarAccionBtnEliminarMateria(funciones.deshabilitarMateria());
	}
}
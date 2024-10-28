package inscripcionExamen;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Timestamp;
import java.util.List; // Asegúrate de importar List si no lo has hecho

/**
 *
 * @author Usuario
 */
public class Examen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp fecha;
    private boolean habilitado;
    private Timestamp fechaCreacion;
    private Usuario docente1; // Definición de la propiedad docente1
    private Usuario docente2; // Definición de la propiedad docente2
    private List<InscripcionMateria> inscripciones; // Definición de la propiedad inscripciones
    private Materia materia; // Definición de la propiedad materia
    private Mesa mesa; // Definición de la propiedad mesa

    public Examen(Long id, Timestamp fecha, boolean habilitado, Timestamp fechaCreacion, 
                  Usuario docente1, Usuario docente2, List<InscripcionMateria> inscripciones, 
                  Materia materia, Mesa mesa) { // Se agrega mesa al constructor
        this.id = id;
        this.fecha = fecha;
        this.habilitado = habilitado;
        this.fechaCreacion = fechaCreacion;
        this.docente1 = docente1; // Inicialización de la propiedad docente1
        this.docente2 = docente2; // Inicialización de la propiedad docente2
        this.inscripciones = inscripciones; // Inicialización de la propiedad inscripciones
        this.materia = materia; // Inicialización de la propiedad materia
        this.mesa = mesa; // Inicialización de la propiedad mesa
    }

    public Examen() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario getDocente1() { // Método getter para docente1
        return docente1;
    }

    public void setDocente1(Usuario docente1) { // Método setter para docente1
        this.docente1 = docente1;
    }

    public Usuario getDocente2() { // Método getter para docente2
        return docente2;
    }

    public void setDocente2(Usuario docente2) { // Método setter para docente2
        this.docente2 = docente2;
    }

    public List<InscripcionMateria> getInscripciones() { // Método getter para inscripciones
        return inscripciones;
    }

    public void setInscripciones(List<InscripcionMateria> inscripciones) { // Método setter para inscripciones
        this.inscripciones = inscripciones;
    }

    public Materia getMateria() { // Método getter para materia
        return materia;
    }

    public void setMateria(Materia materia) { // Método setter para materia
        this.materia = materia;
    }

    public Mesa getMesa() { // Método getter para mesa
        return mesa;
    }

    public void setMesa(Mesa mesa) { // Método setter para mesa
        this.mesa = mesa;
    }
}

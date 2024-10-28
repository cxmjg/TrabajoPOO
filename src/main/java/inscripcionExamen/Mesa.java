package inscripcionExamen;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Usuario
 */
@Entity // Asegúrate de que la clase sea una entidad JPA
public class Mesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp fechaInicio;
    private Timestamp fechaFin;
    private Timestamp fechaInicioInscripcion;
    private Timestamp fechaFinInscripcion;
    private Timestamp fechaCreacion;

    @OneToMany // Relación uno a muchos con Examen
    private List<Examen> examenes; // Definición de la propiedad examenes

    public Mesa(Long id, Timestamp fechaInicio, Timestamp fechaFin, 
                Timestamp fechaInicioInscripcion, Timestamp fechaFinInscripcion, 
                Timestamp fechaCreacion) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaInicioInscripcion = fechaInicioInscripcion;
        this.fechaFinInscripcion = fechaFinInscripcion;
        this.fechaCreacion = fechaCreacion;
    }

    public Mesa() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Timestamp getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Timestamp fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Timestamp getFechaInicioInscripcion() {
        return fechaInicioInscripcion;
    }

    public void setFechaInicioInscripcion(Timestamp fechaInicioInscripcion) {
        this.fechaInicioInscripcion = fechaInicioInscripcion;
    }

    public Timestamp getFechaFinInscripcion() {
        return fechaFinInscripcion;
    }

    public void setFechaFinInscripcion(Timestamp fechaFinInscripcion) {
        this.fechaFinInscripcion = fechaFinInscripcion;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    // Método getter para la propiedad examenes
    public List<Examen> getExamenes() {
        return examenes;
    }

    // Método setter para la propiedad examenes
    public void setExamenes(List<Examen> examenes) {
        this.examenes = examenes;
    }
}

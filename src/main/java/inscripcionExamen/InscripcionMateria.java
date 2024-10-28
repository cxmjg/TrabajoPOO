package inscripcionExamen;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import java.util.Date;

@Entity // Asegúrate de que la clase sea una entidad JPA
public class InscripcionMateria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Usuario alumno;     // Propiedad alumno
    private Materia materia;    // Propiedad materia
    private Date fechaCreacion; // Propiedad fechaCreacion
    private boolean regular;     // Propiedad regular

    public InscripcionMateria() {
    }

    // Método getter para la propiedad alumno
    public Usuario getAlumno() {
        return alumno;
    }

    // Método setter para la propiedad alumno
    public void setAlumno(Usuario alumno) {
        this.alumno = alumno;
    }

    // Método getter para la propiedad materia
    public Materia getMateria() {
        return materia;
    }

    // Método setter para la propiedad materia
    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    // Método getter para la propiedad id
    public Long getId() {
        return id;
    }

    // Método setter para la propiedad id
    public void setId(Long id) {
        this.id = id;
    }

    // Método getter para la propiedad fechaCreacion
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    // Método setter para la propiedad fechaCreacion
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    // Método getter para la propiedad regular
    public boolean isRegular() {
        return regular;
    }

    // Método setter para la propiedad regular
    public void setRegular(boolean regular) {
        this.regular = regular;
    }
}

package inscripcionExamen;

import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contrasena;
    private String nombre;
    private String apellido;
    private String email;
    
    @ManyToOne
    @JoinColumn(name = "rol_id", nullable = false)
    private Rol rol;

    private boolean habilitado;
    private Timestamp fechaCreacion;

    @OneToMany(mappedBy = "docente1", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Examen> examenesDocente1;

    @OneToMany(mappedBy = "docente2", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Examen> examenesDocente2;

    @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<InscripcionMateria> inscripciones;

    @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<InscripcionMateria> inscripcionesMaterias;

    public Usuario() {}

    public Usuario(Long id, String contrasena, String nombre, String apellido, String email,
                   Rol rol, boolean habilitado, Timestamp fechaCreacion,
                   List<Examen> examenesDocente1, List<Examen> examenesDocente2,
                   List<InscripcionMateria> inscripciones, List<InscripcionMateria> inscripcionesMaterias) {
        this.id = id;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.rol = rol;
        this.habilitado = habilitado;
        this.fechaCreacion = fechaCreacion;
        this.examenesDocente1 = examenesDocente1;
        this.examenesDocente2 = examenesDocente2;
        this.inscripciones = inscripciones;
        this.inscripcionesMaterias = inscripcionesMaterias;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
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

    public List<Examen> getExamenesDocente1() {
        return examenesDocente1;
    }

    public void setExamenesDocente1(List<Examen> examenesDocente1) {
        this.examenesDocente1 = examenesDocente1;
    }

    public List<Examen> getExamenesDocente2() {
        return examenesDocente2;
    }

    public void setExamenesDocente2(List<Examen> examenesDocente2) {
        this.examenesDocente2 = examenesDocente2;
    }

    public List<InscripcionMateria> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(List<InscripcionMateria> inscripciones) {
        this.inscripciones = inscripciones;
    }

    public List<InscripcionMateria> getInscripcionesMaterias() {
        return inscripcionesMaterias;
    }

    public void setInscripcionesMaterias(List<InscripcionMateria> inscripcionesMaterias) {
        this.inscripcionesMaterias = inscripcionesMaterias;
    }
}

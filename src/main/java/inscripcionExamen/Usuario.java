package inscripcionExamen;

import jakarta.persistence.*;  // Si usas JPA en versiones recientes (alternativamente, usa javax.persistence.* en versiones más antiguas)
import java.io.Serializable;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID autogenerado
    @Column(name = "id")
    private int id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "perfil", nullable = false)
    private int perfil;

    @Column(name = "habilitado", nullable = false)
    private boolean habilitado;

    // Constructor sin parámetros (obligatorio para JPA/Hibernate)
    public Usuario() {
    }

    // Constructor con parámetros
    public Usuario(int id, String nombre, String password, int perfil, boolean habilitado) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.perfil = perfil;
        this.habilitado = habilitado;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}

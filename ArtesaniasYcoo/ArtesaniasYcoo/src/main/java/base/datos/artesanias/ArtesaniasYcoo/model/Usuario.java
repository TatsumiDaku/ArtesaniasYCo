package base.datos.artesanias.ArtesaniasYcoo.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Artesano getArtesano() {
        return artesano;
    }

    public void setArtesano(Artesano artesano) {
        this.artesano = artesano;
    }

    private String rol;

    @Column(unique = true, nullable = false)
    private String correo;

    private String telefono;

    @OneToOne
    @JoinColumn(name = "artesano_id", nullable = false)
    private Artesano artesano;

    // Constructor vacío
    public Usuario() {}

    // Constructor completo
    public Usuario(String nombre, String rol, String correo, String telefono, Artesano artesano) {
        this.nombre = nombre;
        this.rol = rol;
        this.correo = correo;
        this.telefono = telefono;
        this.artesano = artesano;
    }

    // Getters y Setters
    // ...
}

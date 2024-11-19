package base.datos.artesanias.ArtesaniasYcoo.model;

import jakarta.persistence.*;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
@Table(name = "artesano")
public class Artesano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(unique = true, nullable = false)
    private String email;

    private Integer calificacion;
    private String historiaPersonal;
    private String localizacion;
    private String tecnica;
    private String perfil;
    private String telefono;

    @OneToOne(mappedBy = "artesano", cascade = CascadeType.ALL)
    private Usuario usuario;

    @OneToMany(mappedBy = "artesano", cascade = CascadeType.ALL)
    private List<Producto> productos;

    // Constructor vacío
    public Artesano() {}

    // Constructor completo
    public Artesano(String nombre, String email, Integer calificacion, String historiaPersonal, String localizacion,
                    String tecnica, String perfil, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.calificacion = calificacion;
        this.historiaPersonal = historiaPersonal;
        this.localizacion = localizacion;
        this.tecnica = tecnica;
        this.perfil = perfil;
        this.telefono = telefono;
    }

    // Getters y Setters
    // ...
}

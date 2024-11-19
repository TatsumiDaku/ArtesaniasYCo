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
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(length = 255)
    private String direccion;

    private String telefono;
    private String referencias;
    private String perfil;

    @OneToOne
    @JoinColumn(name = "cabecera_pedido_id", nullable = false)
    private CabeceraPedido cabeceraPedido;

    // Constructor vacío
    public Cliente() {}

    // Constructor completo
    public Cliente(String nombre, String email, String direccion, String telefono, String referencias, String perfil) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.referencias = referencias;
        this.perfil = perfil;
    }

    // Getters y Setters
    // ...
}

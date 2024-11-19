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
@Table(name = "divisas")
public class Divisas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String simbolo;
    private Double tipoCambio;

    @OneToOne(mappedBy = "divisa", cascade = CascadeType.ALL)
    private Pago pago;

    // Constructor vacío
    public Divisas() {}

    // Constructor completo
    public Divisas(String nombre, String simbolo, Double tipoCambio) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.tipoCambio = tipoCambio;
    }

    // Getters y Setters
    // ...
}

package base.datos.artesanias.ArtesaniasYcoo.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "cabecera_pedido")
public class CabeceraPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double total;
    private LocalDate fecha;
    private String estado;

    @OneToOne(mappedBy = "cabeceraPedido", cascade = CascadeType.ALL)
    private Cliente cliente;

    @OneToMany(mappedBy = "cabeceraPedido", cascade = CascadeType.ALL)
    private List<DetallePedido> detalles;

    // Constructor vacío
    public CabeceraPedido() {}

    // Constructor completo
    public CabeceraPedido(Double total, LocalDate fecha, String estado, Cliente cliente) {
        this.total = total;
        this.fecha = fecha;
        this.estado = estado;
        this.cliente = cliente;
    }

    // Getters y Setters
    // ...
}

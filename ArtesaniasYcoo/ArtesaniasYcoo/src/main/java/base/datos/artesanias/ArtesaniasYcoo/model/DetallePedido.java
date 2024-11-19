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
@Table(name = "detalle_pedido")
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private CabeceraPedido cabeceraPedido;

    private Integer cantidad;
    private Double precio;

    @OneToOne
    @JoinColumn(name = "envio_id")
    private Envio envio;

    // Constructor vacío
    public DetallePedido() {}

    // Constructor completo
    public DetallePedido(Producto producto, CabeceraPedido cabeceraPedido, Integer cantidad, Double precio, Envio envio) {
        this.producto = producto;
        this.cabeceraPedido = cabeceraPedido;
        this.cantidad = cantidad;
        this.precio = precio;
        this.envio = envio;
    }

    // Getters y Setters
    // ...
}

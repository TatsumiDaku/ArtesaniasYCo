package base.datos.artesanias.ArtesaniasYcoo.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double monto;
    private String metodoPago;
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "detalle_pedido_id", nullable = false)
    private DetallePedido detallePedido;

    @OneToOne
    @JoinColumn(name = "divisa_id")
    private Divisas divisa;

    // Constructor vacío
    public Pago() {}

    // Constructor completo
    public Pago(Double monto, String metodoPago, LocalDate fecha, DetallePedido detallePedido, Divisas divisa) {
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.fecha = fecha;
        this.detallePedido = detallePedido;
        this.divisa = divisa;
    }

    // Getters y Setters
    // ...
}

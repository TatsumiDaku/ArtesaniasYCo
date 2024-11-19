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
@Table(name = "envio")
public class Envio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idPedido;
    private LocalDate fechaSalida;
    private LocalDate fechaEntrega;
    private Double costo;

    @Column(length = 255)
    private String direccion;

    private String estadoEnvio;
    private String empresaLog;

    @OneToOne(mappedBy = "envio", cascade = CascadeType.ALL)
    private DetallePedido detallePedido;

    // Constructor vacío
    public Envio() {}

    // Constructor completo
    public Envio(Long idPedido, LocalDate fechaSalida, LocalDate fechaEntrega, Double costo, String direccion,
                 String estadoEnvio, String empresaLog) {
        this.idPedido = idPedido;
        this.fechaSalida = fechaSalida;
        this.fechaEntrega = fechaEntrega;
        this.costo = costo;
        this.direccion = direccion;
        this.estadoEnvio = estadoEnvio;
        this.empresaLog = empresaLog;
    }

    // Getters y Setters
    // ...
}

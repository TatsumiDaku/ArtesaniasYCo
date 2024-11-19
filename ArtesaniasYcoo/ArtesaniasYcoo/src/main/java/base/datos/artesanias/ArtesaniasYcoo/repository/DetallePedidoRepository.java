package base.datos.artesanias.ArtesaniasYcoo.repository;

import base.datos.artesanias.ArtesaniasYcoo.model.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Long> {
}

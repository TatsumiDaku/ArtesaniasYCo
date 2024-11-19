package base.datos.artesanias.ArtesaniasYcoo.repository;

import base.datos.artesanias.ArtesaniasYcoo.model.CabeceraPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabeceraPedidoRepository extends JpaRepository<CabeceraPedido, Long> {
}

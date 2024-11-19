package base.datos.artesanias.ArtesaniasYcoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import base.datos.artesanias.ArtesaniasYcoo.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}

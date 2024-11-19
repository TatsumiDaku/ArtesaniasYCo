package base.datos.artesanias.ArtesaniasYcoo.repository;

import base.datos.artesanias.ArtesaniasYcoo.model.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Long> {
}

package base.datos.artesanias.ArtesaniasYcoo.repository;

import base.datos.artesanias.ArtesaniasYcoo.model.Artesano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtesanoRepository extends JpaRepository<Artesano, Long> {
}

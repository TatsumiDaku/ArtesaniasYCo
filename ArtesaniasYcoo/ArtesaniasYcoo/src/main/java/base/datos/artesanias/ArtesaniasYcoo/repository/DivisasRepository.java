package base.datos.artesanias.ArtesaniasYcoo.repository;

import base.datos.artesanias.ArtesaniasYcoo.model.Divisas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisasRepository extends JpaRepository<Divisas, Long> {
}

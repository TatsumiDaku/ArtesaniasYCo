package base.datos.artesanias.ArtesaniasYcoo.service;

import base.datos.artesanias.ArtesaniasYcoo.model.Artesano;
import base.datos.artesanias.ArtesaniasYcoo.repository.ArtesanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtesanoService {

    @Autowired
    private ArtesanoRepository artesanoRepository;

    public Artesano saveArtesano(Artesano artesano) {
        return artesanoRepository.save(artesano);
    }

    public List<Artesano> getAllArtesanos() {
        return artesanoRepository.findAll();
    }

    public Optional<Artesano> getArtesanoById(Long id) {
        return artesanoRepository.findById(id);
    }

    public void deleteArtesano(Long id) {
        artesanoRepository.deleteById(id);
    }
}

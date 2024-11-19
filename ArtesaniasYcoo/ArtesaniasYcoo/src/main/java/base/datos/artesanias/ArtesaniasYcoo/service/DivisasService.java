package base.datos.artesanias.ArtesaniasYcoo.service;

import base.datos.artesanias.ArtesaniasYcoo.model.Divisas;
import base.datos.artesanias.ArtesaniasYcoo.repository.DivisasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DivisasService {

    @Autowired
    private DivisasRepository divisasRepository;

    public Divisas saveDivisas(Divisas divisas) {
        return divisasRepository.save(divisas);
    }

    public List<Divisas> getAllDivisas() {
        return divisasRepository.findAll();
    }

    public Optional<Divisas> getDivisasById(Long id) {
        return divisasRepository.findById(id);
    }

    public void deleteDivisas(Long id) {
        divisasRepository.deleteById(id);
    }
}

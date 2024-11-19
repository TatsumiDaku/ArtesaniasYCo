package base.datos.artesanias.ArtesaniasYcoo.service;

import base.datos.artesanias.ArtesaniasYcoo.model.Pago;
import base.datos.artesanias.ArtesaniasYcoo.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoService {

    @Autowired
    private PagoRepository pagoRepository;

    public Pago savePago(Pago pago) {
        return pagoRepository.save(pago);
    }

    public List<Pago> getAllPagos() {
        return pagoRepository.findAll();
    }

    public Optional<Pago> getPagoById(Long id) {
        return pagoRepository.findById(id);
    }

    public void deletePago(Long id) {
        pagoRepository.deleteById(id);
    }
}

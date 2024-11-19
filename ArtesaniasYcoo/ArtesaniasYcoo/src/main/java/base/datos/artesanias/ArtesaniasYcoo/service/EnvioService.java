package base.datos.artesanias.ArtesaniasYcoo.service;

import base.datos.artesanias.ArtesaniasYcoo.model.Envio;
import base.datos.artesanias.ArtesaniasYcoo.repository.EnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnvioService {

    @Autowired
    private EnvioRepository envioRepository;

    public Envio saveEnvio(Envio envio) {
        return envioRepository.save(envio);
    }

    public List<Envio> getAllEnvios() {
        return envioRepository.findAll();
    }

    public Optional<Envio> getEnvioById(Long id) {
        return envioRepository.findById(id);
    }

    public void deleteEnvio(Long id) {
        envioRepository.deleteById(id);
    }
}

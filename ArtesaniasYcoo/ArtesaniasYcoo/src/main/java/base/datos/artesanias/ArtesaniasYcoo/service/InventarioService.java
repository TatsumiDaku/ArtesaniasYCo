package base.datos.artesanias.ArtesaniasYcoo.service;

import base.datos.artesanias.ArtesaniasYcoo.model.Inventario;
import base.datos.artesanias.ArtesaniasYcoo.repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    public Inventario saveInventario(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    public List<Inventario> getAllInventarios() {
        return inventarioRepository.findAll();
    }

    public Optional<Inventario> getInventarioById(Long id) {
        return inventarioRepository.findById(id);
    }

    public void deleteInventario(Long id) {
        inventarioRepository.deleteById(id);
    }
}

package base.datos.artesanias.ArtesaniasYcoo.service;

import base.datos.artesanias.ArtesaniasYcoo.model.CabeceraPedido;
import base.datos.artesanias.ArtesaniasYcoo.repository.CabeceraPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CabeceraPedidoService {

    @Autowired
    private CabeceraPedidoRepository cabeceraPedidoRepository;

    public CabeceraPedido saveCabeceraPedido(CabeceraPedido cabeceraPedido) {
        return cabeceraPedidoRepository.save(cabeceraPedido);
    }

    public List<CabeceraPedido> getAllCabeceraPedidos() {
        return cabeceraPedidoRepository.findAll();
    }

    public Optional<CabeceraPedido> getCabeceraPedidoById(Long id) {
        return cabeceraPedidoRepository.findById(id);
    }

    public void deleteCabeceraPedido(Long id) {
        cabeceraPedidoRepository.deleteById(id);
    }
}

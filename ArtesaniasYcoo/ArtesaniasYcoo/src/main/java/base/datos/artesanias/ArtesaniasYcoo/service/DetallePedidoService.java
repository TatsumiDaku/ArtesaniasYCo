package base.datos.artesanias.ArtesaniasYcoo.service;

import base.datos.artesanias.ArtesaniasYcoo.model.DetallePedido;
import base.datos.artesanias.ArtesaniasYcoo.repository.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetallePedidoService {

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public DetallePedido saveDetallePedido(DetallePedido detallePedido) {
        return detallePedidoRepository.save(detallePedido);
    }

    public List<DetallePedido> getAllDetallePedidos() {
        return detallePedidoRepository.findAll();
    }

    public Optional<DetallePedido> getDetallePedidoById(Long id) {
        return detallePedidoRepository.findById(id);
    }

    public void deleteDetallePedido(Long id) {
        detallePedidoRepository.deleteById(id);
    }
}

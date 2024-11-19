package base.datos.artesanias.ArtesaniasYcoo.service;

import base.datos.artesanias.ArtesaniasYcoo.model.Producto;
import base.datos.artesanias.ArtesaniasYcoo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    // Crear o actualizar un Producto
    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Obtener todos los productos
    public List<Producto> obtenerTodos() {
        return productoRepository.findAll();
    }

    public Optional<Producto> obtenerPorId(Long id) {
        return productoRepository.findById(id);
    }



    // Crear un nuevo producto
    public Producto crearProducto(Producto producto) {
        // Aquí se guarda el producto en la base de datos
        return productoRepository.save(producto);
    }

    // Actualizar un producto existente
    public Optional<Producto> actualizarProducto(Long id, Producto producto) {
        // Verificar si el producto existe
        Optional<Producto> productoExistente = productoRepository.findById(id);
        if (productoExistente.isPresent()) {
            // Si el producto existe, actualizamos los campos necesarios
            Producto productoActualizado = productoExistente.get();
            productoActualizado.setNombre(producto.getNombre());
            productoActualizado.setDescripcion(producto.getDescripcion());
            productoActualizado.setCategoria(producto.getCategoria());
            productoActualizado.setMaterial(producto.getMaterial());
            productoActualizado.setPrecio(producto.getPrecio());
            productoActualizado.setFechaCarga(producto.getFechaCarga());
            productoActualizado.setDisponibilidad(producto.getDisponibilidad());
            productoActualizado.setPersonalizable(producto.getPersonalizable());
            productoActualizado.setArtesano(producto.getArtesano());

            return Optional.of(productoRepository.save(productoActualizado));
        } else {
            // Si no existe, devolvemos Optional.empty()
            return Optional.empty();
        }
    }

    // Eliminar un producto por su ID
    public boolean eliminarProducto(Long id) {
        // Verificar si el producto existe antes de eliminarlo
        if (productoRepository.existsById(id)) {
            productoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}

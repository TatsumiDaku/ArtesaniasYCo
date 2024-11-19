package base.datos.artesanias.ArtesaniasYcoo.controller;

import base.datos.artesanias.ArtesaniasYcoo.model.Producto;
import base.datos.artesanias.ArtesaniasYcoo.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    // Obtener todos los productos
    @GetMapping
    public ResponseEntity<List<Producto>> obtenerTodos() {
        List<Producto> productos = productoService.obtenerTodos();
        if (productos.isEmpty()) {
            return ResponseEntity.noContent().build(); // Respuesta vacía si no hay productos
        }
        return ResponseEntity.ok(productos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerPorId(@PathVariable Long id) {
        System.out.println("Buscando producto con ID: " + id);
        Optional<Producto> producto = productoService.obtenerPorId(id);
        if (producto.isPresent()) {
            return ResponseEntity.ok(producto.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

// agregar un nuevo producto




    // Actualizar un producto existente
    @PutMapping("/{id}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable Long id, @RequestBody Producto producto) {
        return productoService.actualizarProducto(id, producto)
                .map(ResponseEntity::ok)  // Si el producto se actualiza, devuelve un 200 OK
                .orElse(ResponseEntity.status(404).body((Producto) Map.of("error", "Producto no encontrado para actualizar"))); // Devolviendo un Map con el mensaje de error
    }

    // Eliminar un producto por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id) {
        if (productoService.eliminarProducto(id)) {
            return ResponseEntity.noContent().build(); // Si se elimina, devuelve un 204 No Content
        } else {
            return ResponseEntity.status(404).build(); // Si no se encuentra, devuelve un 404 con el cuerpo vacío
        }
    }

}

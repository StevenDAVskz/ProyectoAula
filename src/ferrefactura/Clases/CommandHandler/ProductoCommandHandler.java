/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases.CommandHandler;
import ferrefactura.Clases.Productos;
import ferrefactura.negocios.acciones.commands.CreateProducto;
import ferrefactura.negocios.acciones.commands.DeleteProducto;
import ferrefactura.negocios.acciones.commands.UpdateProducto;

/**
 *
 * @author USUARIO
 */
public class ProductoCommandHandler {
    private ProductoRepository productoRepository;

    public ProductoCommandHandler(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // Manejar la creación de un producto
    public void handle(CreateProducto command) {
        Productos producto;
        producto = new Productos(
                command.getNombre(),
                command.getId(),
                command.getPrecio(),
                command.getCantidadVentas(),
                command.getDescripcion(),
                command.getCalidad(),
                command.getCantidadAlmacen()
        );
        productoRepository.save(producto); // Guarda el nuevo producto
    }

    // Manejar la actualización de un producto
    public void handle(UpdateProducto command) {
        Productos producto = productoRepository.findById(command.getId());
        if (producto != null) {
            // Actualiza los atributos del producto
            producto.setNombre(command.getNombre());
            producto.setPrecio(command.getPrecio());
            producto.setCantidadVentas(command.getCantidadVentas());
            producto.setDescripcion(command.getDescripcion());
            producto.setCalidad(command.getCalidad());
            producto.setCantidadAlmacen(command.getCantidadAlmacen());
            productoRepository.save(producto); // Guarda las actualizaciones
        }
    }

    // Manejar la eliminación de un producto
    public void handle(DeleteProducto command) {
        // Verificar si el producto existe
        Productos producto = productoRepository.findById(command.getId());

        if (producto != null) {
            // Eliminar el producto del repositorio
            productoRepository.delete(command.getId());
        } else {
            // Manejar el caso en que el producto no se encuentra (opcional)
            throw new RuntimeException("Producto no encontrado");
        }
    }
}

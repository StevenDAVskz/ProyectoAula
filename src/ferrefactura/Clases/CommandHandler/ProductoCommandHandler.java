/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases.CommandHandler;
import ferrefactura.Clases.Productos;
import ferrefactura.Clases.Comand.CreateProducto;
import ferrefactura.Clases.Comand.DeleteProducto;
import ferrefactura.Clases.Comand.UpdateProducto;

/**
 *
 * @author USUARIO
 */
public class ProductoCommandHandler {
    private ProductoRepository productorepository;

    public ProductoCommandHandler(ProductoRepository productorepository) {
        this.productorepository = productorepository;
    }
    
    public void handler(CreateProducto command){
        Productos productos = new Productos(
        command.getNombre(),
        command.getId(),
        command.getCantidadVentas(),
        command.getDescripcion(),
        command.getPrecio(),
        command.getCalidad(),
        command.getCantidadAlmacen());
        productorepository.save(productos);
    }
    public void handler(UpdateProducto command){
        Productos productos = productorepository.findById(String.valueOf(command.getId()));
        if(productos != null){
            productos.setNombre(command.getNombre());
            productos.setId(command.getId());
            productos.setCantidadVentas(command.getCantidadVentas());
            productos.setDescripcion(command.getDescripcion());
            productos.setPrecio(command.getPrecio());
            productos.setCalidad(command.getCalidad());
            productos.setCantidadAlmacen(command.getCantidadAlmacen());
            productorepository.save(productos);
        }
    }
    public void handler(DeleteProducto command){
        Productos productos = productorepository.findById(String.valueOf(command.getId()));
        if (productos != null){
            productorepository.delete(String.valueOf(command.getId()));
        }else{
            throw new RuntimeException("Producto no encontrado");
        }
    }
}

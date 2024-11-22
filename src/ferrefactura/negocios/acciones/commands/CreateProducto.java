/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.negocios.acciones.commands;

/**
 *
 * @author USUARIO
 */
public class CreateProducto{
    private String nombre;
    private int id;
    private int CantidadVentas;
    private String Descripcion;
    private int Precio;
    private String Calidad;
    private int CantidadAlmacen;

    public CreateProducto(String nombre, int id, int CantidadVentas, String Descripcion, int Precio, String Calidad, int CantidadAlmacen) {
        this.nombre = nombre;
        this.id = id;
        this.CantidadVentas = CantidadVentas;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Calidad = Calidad;
        this.CantidadAlmacen = CantidadAlmacen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getCantidadVentas() {
        return CantidadVentas;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getPrecio() {
        return Precio;
    }

    public String getCalidad() {
        return Calidad;
    }

    public int getCantidadAlmacen() {
        return CantidadAlmacen;
    }
    
    
}
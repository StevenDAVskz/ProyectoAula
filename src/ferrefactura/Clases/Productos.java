/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases;

/**
 *
 * @author steve
 */
public class Productos {
    protected String nombre;
    protected int id;
    protected int CantidadVentas;
    protected String Descripcion;
    protected int Precio;
    protected String Calidad;
    protected int CantidadAlmacen;
    
    public Productos() {
    }

    public Productos(String nombre, int id, int CantidadVentas, String Descripcion, int Precio, String Calidad, int CantidadAlmacen) {
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadVentas() {
        return CantidadVentas;
    }

    public void setCantidadVentas(int CantidadVentas) {
        this.CantidadVentas = CantidadVentas;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getCalidad() {
        return Calidad;
    }

    public void setCalidad(String Calidad) {
        this.Calidad = Calidad;
    }

    public int getCantidadAlmacen() {
        return CantidadAlmacen;
    }

    public void setCantidadAlmacen(int CantidadAlmacen) {
        this.CantidadAlmacen = CantidadAlmacen;
    }
    
}

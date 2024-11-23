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
    protected double Precio;
    protected int CantidadVentas;
    protected String Descripcion;
    protected String Calidad;
    protected int CantidadAlmacen;

    public Productos() {
    }

    public Productos(String nombre, int id, double Precio, int CantidadVentas, String Descripcion, String Calidad, int CantidadAlmacen) {
        this.nombre = nombre;
        this.id = id;
        this.Precio = Precio;
        this.CantidadVentas = CantidadVentas;
        this.Descripcion = Descripcion;
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

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
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

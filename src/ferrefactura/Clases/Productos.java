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
    protected double CantidadVentas;
    protected String Descripcion;
    protected String Calidad;
    protected int CantidadAlmacen;

    public Productos() {
    }

    public Productos(String nombre, int id, double Precio, double CantidadVentas, String Descripcion, String Calidad, int CantidadAlmacen) {
        this.nombre = nombre;
        this.id = id;
        this.Precio = Precio;
        this.CantidadVentas = CantidadVentas;
        this.Descripcion = Descripcion;
        this.Calidad = Calidad;
        this.CantidadAlmacen = CantidadAlmacen;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public double getprecio() {
        return Precio;
    }

    public void setprecio(double Precio) {
        this.Precio = Precio;
    }

    public double getcantidadVentas() {
        return CantidadVentas;
    }

    public void setcantidadVentas(double CantidadVentas) {
        this.CantidadVentas = CantidadVentas;
    }

    public String getdescripcion() {
        return Descripcion;
    }

    public void setdescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getcalidad() {
        return Calidad;
    }

    public void setcalidad(String Calidad) {
        this.Calidad = Calidad;
    }

    public int getcantidadAlmacen() {
        return CantidadAlmacen;
    }

    public void setcantidadAlmacen(int CantidadAlmacen) {
        this.CantidadAlmacen = CantidadAlmacen;
    }
    
   
}

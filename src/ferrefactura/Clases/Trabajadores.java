/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases;

/**
 *
 * @author steve
 */
public class Trabajadores extends Usuarios{
    protected int Salario;
    protected String ProductosVendidos;

    public Trabajadores() {
    }

    public Trabajadores(int Salario, String ProductosVendidos) {
        this.Salario = Salario;
        this.ProductosVendidos = ProductosVendidos;
    }

    public Trabajadores(int Salario, String ProductosVendidos, String Nombre, String ID, String Dirrecion, String Email, String Numero, String Contraseña) {
        super(Nombre, ID, Dirrecion, Email, Numero, Contraseña);
        this.Salario = Salario;
        this.ProductosVendidos = ProductosVendidos;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public String getProductosVendidos() {
        return ProductosVendidos;
    }

    public void setProductosVendidos(String ProductosVendidos) {
        this.ProductosVendidos = ProductosVendidos;
    }
    
    


    
    
    
}

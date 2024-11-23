/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases;


/**
 *
 * @author steve
 */
public class Usuarios {
    
    protected String Nombre;
    protected String ID;
    protected String Dirrecion;
    protected String Email;
    protected String Numero;
    protected String Contraseña;

    public Usuarios() {
    }

    public Usuarios(String Nombre, String ID, String Dirrecion, String Email, String Numero, String Contraseña) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Dirrecion = Dirrecion;
        this.Email = Email;
        this.Numero = Numero;
        this.Contraseña = Contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDirrecion() {
        return Dirrecion;
    }

    public void setDirrecion(String Dirrecion) {
        this.Dirrecion = Dirrecion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
   
    
}

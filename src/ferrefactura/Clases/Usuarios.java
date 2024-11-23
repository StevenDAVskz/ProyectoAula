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
    protected int ID;
    protected String Direccion;
    protected String Email;
    protected int Numero;
    protected String Contraseña;
    protected String Rol;

    public Usuarios() {
    }

    public Usuarios(String Nombre, int ID, String Direccion, String Email, int Numero, String Contraseña, String Rol) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Direccion = Direccion;
        this.Email = Email;
        this.Numero = Numero;
        this.Contraseña = Contraseña;
        this.Rol = Rol;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getContrasena() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    public String getRol() {
        return Rol;
    }
    
    public void setRol(String Rol) {
        this.Rol = Rol;
    }
   
    
}

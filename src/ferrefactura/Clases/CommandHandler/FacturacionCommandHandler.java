/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases.CommandHandler;
import ferrefactura.Clases.Facturacion;
import ferrefactura.negocios.acciones.commands.CreateFacturacion;
import ferrefactura.negocios.acciones.commands.DeleteFacturacion;
import ferrefactura.negocios.acciones.commands.UpdateFacturacion;

/**
 *
 * @author LENOVO
 */
public class FacturacionCommandHandler {
    private FacturacionRepository facturacionrepository;
    
     public FacturacionCommandHandler(FacturacionRepository facturacionrepository) {
        this.facturacionrepository = facturacionrepository;
    }
    public void handler(CreateFacturacion command){
        Facturacion facturacion=new Facturacion(
            command.getUser(),
            command.getProductos(),
            command.getTrabajador(),
            command.getIdfactura());
        facturacionrepository.save(facturacion);
    }
    public void handler(UpdateFacturacion command){
        Facturacion facturacion = facturacionrepository.findById(String.valueOf(command.getIdfactura()));
        if(facturacion != null){
            facturacion.setUser(command.getUser());
            facturacion.setProductos(command.getProductos());
            facturacion.setTrabajador(command.getTrabajador());
            facturacionrepository.save(facturacion);
        }    
    }
    public void handler(DeleteFacturacion command){
        Facturacion facturacion = facturacionrepository.findById(String.valueOf(command.getIdfactura()));
        if (facturacion != null){
            facturacionrepository.delete(String.valueOf(command.getIdfactura()));
        }else{
            throw new RuntimeException("Factura no encontrada");
        }       
    }
}

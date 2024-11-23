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
    private FacturacionRepository facturacionRepository;

    public FacturacionCommandHandler(FacturacionRepository facturacionRepository) {
        this.facturacionRepository = facturacionRepository;
    }

    // Manejar la creación de una factura
    public void handle(CreateFacturacion command) {
        Facturacion facturacion = new Facturacion(
                command.getIdfactura(),           
                command.getProductos(),    
                command.getUser(),
                command.getPrecio()
        );
        facturacionRepository.save(facturacion); // Guarda la nueva factura
    }

    // Manejar la actualización de una factura
    public void handle(UpdateFacturacion command) {
        Facturacion facturacion = facturacionRepository.findById(command.getIdfactura());
        if (facturacion != null) {
            // Actualiza los atributos de la factura
            facturacion.setProductos(command.getProductos());
            facturacion.setUser(command.getUser());
            facturacionRepository.save(facturacion); // Guarda las actualizaciones
        }
    }

    // Manejar la eliminación de una factura
    public void handle(DeleteFacturacion command) {
        // Verificar si la factura existe
        Facturacion facturacion = facturacionRepository.findById(command.getIdfactura());

        if (facturacion != null) {
            // Eliminar la factura del repositorio
            facturacionRepository.delete(command.getIdfactura());
        } else {
            // Manejar el caso en que la factura no se encuentra (opcional)
            throw new RuntimeException("Factura no encontrada");
        }
    }
}


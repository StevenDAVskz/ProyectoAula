/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases.CommandHandler;

import ferrefactura.Clases.Facturacion;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public class FacturacionRepository {
    private Map<String, Facturacion> database = new HashMap<>();

    public void save(Facturacion facturacion) {
         database.put(String.valueOf((char) facturacion.getIdfactura()), facturacion);
    }

    public Facturacion findById(String idfactura) {
        return database.get(idfactura);
    }

    public Map<String, Facturacion> findAll() {
        return database;
    }
    
    public void delete(String idfactura) {
    database.remove(idfactura); // Elimina la factura del mapa
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases.CommandHandler;

import ferrefactura.Clases.Facturacion;
import ferrefactura.Clases.Productos;
import ferrefactura.Clases.Usuarios;
import java.sql.*;

import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class FacturacionRepository {
    private Connection conn;

    // Constructor que establece la conexión con la base de datos
    public FacturacionRepository() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ferrefactura", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    // Método para guardar un producto
public boolean save(Facturacion facturacion) {
    String checkQuery = "SELECT COUNT(*) FROM productos WHERE id_factura = ?";
    String insertQuery = "INSERT INTO productos (id_factura, producto, usuario) VALUES (?, ?, ?)";

    try {
        // Verificar si el ID de la factura ya existe en la base de datos
        PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
        checkStmt.setInt(1, facturacion.getIdfactura());
        ResultSet rs = checkStmt.executeQuery();
        rs.next();
        if (rs.getInt(1) > 0) {
            JOptionPane.showMessageDialog(null, "ID de factura ya en uso: " + facturacion.getIdfactura(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Insertar el nuevo producto en la base de datos
        PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
        insertStmt.setInt(1, facturacion.getIdfactura());
        insertStmt.setString(2, facturacion.getProductos()); 
        insertStmt.setString(3, facturacion.getUser()); 


        int rowsAffected = insertStmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Producto creado con éxito!");
            return true;
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al crear el producto: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    return false;
}

// Método para encontrar un producto por ID de factura
public Facturacion findById(int idFactura) {
    String query = "SELECT * FROM productos WHERE id_factura = ?";
    Facturacion facturacion = null;

    try {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, idFactura);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            facturacion = new Facturacion(
                rs.getInt("id_factura"),
                rs.getString("producto"),
                rs.getString("usuario")
            );
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al encontrar el producto: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    return facturacion;
}

// Método para obtener todos los productos
public ResultSet findAll() {
    String query = "SELECT * FROM productos";
    ResultSet rs = null;

    try {
        Statement stmt = conn.createStatement();
        rs = stmt.executeQuery(query);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener todos los productos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    return rs;
}

// Método para eliminar un producto por ID de factura
public boolean delete(int idFactura) {
    String query = "DELETE FROM productos WHERE id_factura = ?";

    try {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, idFactura);
        int rowsAffected = stmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Producto eliminado con éxito!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Producto no encontrado!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el producto: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    return false;
}

// Cerrar la conexión
public void closeConnection() {
    try {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

}

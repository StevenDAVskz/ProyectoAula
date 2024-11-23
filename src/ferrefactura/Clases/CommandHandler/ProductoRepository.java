/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferrefactura.Clases.CommandHandler;
import ferrefactura.Clases.Productos;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author USUARIO
 */
public class ProductoRepository {
     private Connection conn;

    // Constructor que establece la conexión con la base de datos
    public ProductoRepository() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ferrefactura", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Método para guardar un producto
public boolean save(Productos producto) {
    String checkQuery = "SELECT COUNT(*) FROM productos WHERE id_producto = ?";
    String insertQuery = "INSERT INTO productos (producto, id_producto, precio, cantidad, descripcion, calidad, cant_almacen) VALUES (?, ?, ?, ?, ?, ?, ?)";

    try {
        // Verificar si el ID del producto ya existe en la base de datos
        PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
        checkStmt.setInt(1, producto.getId());
        ResultSet rs = checkStmt.executeQuery();
        rs.next();
        if (rs.getInt(1) > 0) {
            JOptionPane.showMessageDialog(null, "ID de producto ya en uso: " + producto.getId(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Insertar el nuevo producto en la base de datos
        PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
        insertStmt.setString(1, producto.getNombre());
        insertStmt.setInt(2, producto.getId());
        insertStmt.setDouble(3, producto.getPrecio());
        insertStmt.setDouble(4, producto.getCantidadVentas());
        insertStmt.setString(5, producto.getDescripcion());
        insertStmt.setString(6, producto.getCalidad());
        insertStmt.setInt(7, producto.getCantidadAlmacen());

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

// Método para encontrar un producto por ID
public Productos findById(int idProducto) {
    String query = "SELECT * FROM productos WHERE id_producto = ?";
    Productos producto = null;

    try {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, idProducto);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            producto = new Productos(
                rs.getString("producto"),
                rs.getInt("id_producto"),
                rs.getDouble("precio"),
                rs.getInt("cantidad"),
                rs.getString("descripcion"),
                rs.getString("calidad"),
                rs.getInt("cant_almacen")
            );
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al encontrar el producto: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    return producto;
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

// Método para eliminar un producto por ID
public boolean delete(int idProducto) {
    String query = "DELETE FROM productos WHERE id_producto = ?";

    try {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, idProducto);
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

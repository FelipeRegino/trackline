package DAO;
/**
 *
 * @author Felipe
 */

/*
import models.Locale;
import helpers.MyConnect;
import item_location.ItemLocation;
import java.sql.*;

public class LocaleDAO {
    
    private Connection connection;
    long id;
    double Lat;
    double Lng;

    public LocaleDAO(){
        try {
            this.connection = new MyConnect().connection;
        } catch (ClassNotFoundException ex) {
            System.out.println("ERRO de conexão: " + ex);
        } catch (SQLException ex) {
            System.out.println("ERRO de conexão: " + ex);
        }
    }
    
    public void add(ItemLocation itemLocation){
        String sql = "UPDATE locale SET Lat=?, Lng=? WHERE id=1 LIMIT 1";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setDouble(1, itemLocation.addLat(ItemLocation.addLat));
            stmt.setDouble(2, itemLocation.addLng(ItemLocation.addLng));
            stmt.executeUpdate();
            stmt.close();
        } catch (Exception e) {
           System.out.println("ERRO ao salvar: " + e); 
        }
    }    
}
*/
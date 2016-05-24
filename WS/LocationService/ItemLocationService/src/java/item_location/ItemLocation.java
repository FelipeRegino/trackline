
package item_location;


import helpers.MyConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


/**
 *
 * @author User
 */
@WebService()
public class ItemLocation {

    private Connection connection;
    public static double addLng;
    public static double addLat;

    public ItemLocation(){
        try {
            this.connection = new MyConnect().connection;
        } catch (ClassNotFoundException ex) {
            System.out.println("ERRO de conexão: " + ex);
        } catch (SQLException ex) {
            System.out.println("ERRO de conexão: " + ex);
        }
    }
    
    
    
    
    /**
     * Web service operation
     * @param Lat
     * @param Lng
     * @return 
     */
    @WebMethod(operationName = "addLat")
    public double addLat(@WebParam(name = "Lat") double Lat) {
        String sql = "UPDATE locale SET Lat=? WHERE id=1 LIMIT 1";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setDouble(1, Lat);
            stmt.executeUpdate();
            stmt.close();
        } catch (Exception e) {
           System.out.println("ERRO ao salvar: " + e); 
        }
        return Lat;
    }
    
    @WebMethod(operationName = "addLng")
    public double addLng(@WebParam(name = "Lng") double Lng) {
        String sql = "UPDATE locale SET Lng=? WHERE id=1 LIMIT 1";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setDouble(1, Lng);
            stmt.executeUpdate();
            stmt.close();
        } catch (Exception e) {
           System.out.println("ERRO ao salvar: " + e); 
        }
        return Lng;
    }
}

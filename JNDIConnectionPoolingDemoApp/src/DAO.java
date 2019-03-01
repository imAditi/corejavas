import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

public class DAO {
	String databaseURL = "jdbc:mysql://localhost:3306/mydb1";
    String user = "root";
    String password = "pass";
     
    public List<Category> list() throws SQLException {
        List<Category> listCategory = new ArrayList<>();
         
        try (Connection connection = DriverManager.getConnection(databaseURL, user, password)) {
            String sql = "SELECT * FROM users";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
             
            while (result.next()) {
                int id = result.getInt("category_id");
                String name = result.getString("name");
                Category category = null;
                     
                listCategory.add(category);
            }          
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }      
         
        return listCategory;
    }
}



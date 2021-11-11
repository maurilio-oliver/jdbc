import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import db.DB;

public class App {


    public static void main(String[] args) throws Exception {

        Connection conn;
        Statement statement;
        ResultSet resultSet;

        try {
            conn = DB.getConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM department");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id")+"<===>"+resultSet.getString("name"));
              
                
            }
            conn.close();
         

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    
}

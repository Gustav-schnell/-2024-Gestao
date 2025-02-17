package Banco;


import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author adaltoss
 */
public class ConexaoBanco {
    
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/simulador?zeroDateTimeBehavior=convertToNull";
    private static final String USER = "root";
    
    // para quem instalou o XAMPP
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String SENHA = "";
    
    
    // para quem não instalou o XAMPP ou está nos PCs da FADERGS
    //    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    //    private static final String SENHA = "root";
    
    public static void executar(String query){
        try {
            Class.forName( DRIVER );
            Connection conn = DriverManager.getConnection(URL,USER,SENHA);
            Statement st = conn.createStatement();
            st.execute( query );
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public static ResultSet consultar(String query){
        try {
            Class.forName( DRIVER );
            Connection conn = DriverManager.getConnection(URL,USER,SENHA);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery( query );
        //    conn.close();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }   
}
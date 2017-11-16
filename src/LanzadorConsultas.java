
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class LanzadorConsultas extends Thread{

    //Variables Globales.
    private Connection con = null;
    
    public LanzadorConsultas(Connection con) {
        this.con = con;
    }
    
    
    
    @Override
    public void run(){
        try {
            Consulta h= new Consulta();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("");
        } catch (SQLException ex) {
            Logger.getLogger(LanzadorConsultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

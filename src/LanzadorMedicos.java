
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
public class LanzadorMedicos extends Thread {

    //Variables Globales.
    private Connection con = null;
    private int i = 0;
    
    public LanzadorMedicos(Connection con, int i) {
        this.con = con;
        this.i = i;
    }
    
    @Override
    public void run() {
        try {
            Medico h = new Medico(i,"B");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("");
        } catch (SQLException ex) {
            Logger.getLogger(LanzadorMedicos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


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
public class LanzadorHospital extends Thread implements Runnable{
    
    //Variables Globales.
    private Connection con = null;
    private int i = 0;
    
    public LanzadorHospital(Connection con, int i) {
        this.con = con;
        this.i = i;
    }
    
    @Override
    public void run(){
        try {
            String n="hospital"+i;
            Hospital h= new Hospital(i,n);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("");
        } catch (SQLException ex) {
            Logger.getLogger(LanzadorHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

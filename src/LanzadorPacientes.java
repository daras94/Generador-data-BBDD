
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
public class LanzadorPacientes extends Thread {

    //Variables Globales.
    private Connection con = null;
    private int i = 0;
    
    public LanzadorPacientes(Connection con, int i) {
        this.con = con;
        this.i = i;
    }
    
    @Override
    public void run() {
        try {
            Paciente h = new Paciente(i);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("");
        } catch (SQLException ex) {
            Logger.getLogger(LanzadorPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

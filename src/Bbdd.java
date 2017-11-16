
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bea
 */
public class Bbdd {

    private String[] url;
    private String[] user;
    private String[] pass;
    private Connection con = null;

    public Bbdd() {
        this.user = new String[]{"",""};
        this.url = new String[]{"",""};
        this.pass = new String[]{"",""};
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bbdd o1 = new Bbdd();
         System.out.println("/*************************************************/");
         System.out.println("/* 1 - Inset MYSQL.                              */");
         System.out.println("/* 2 - Inset MYSQL.                              */");
         System.out.println("/*************************************************/");
         System.out.println("Selecione un opcion: ");
        try {
            int opc = (new BufferedReader(new InputStreamReader(System.in))).read();
            o1.connect(opc);
        } catch (IOException ex) {
            Logger.getLogger(Bbdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void connect(int opc){
        try {
            con = DriverManager.getConnection(this.url[opc], this.user[0], this.pass[0]);
        } catch (SQLException ex) {
            Logger.getLogger(Bbdd.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error de conexion.");
        }
    }
    
    
}

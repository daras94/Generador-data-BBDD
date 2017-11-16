
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
    private Connection con;

    public Bbdd() {
        this.user = new String[]{"root", "postgres"};
        this.url = new String[]{"jdbc:postgresql://localhost:5432/pacientes", "jdbc:mysql://localhost:3306/pacientes"};
        this.pass = new String[]{"551994", "551994"};
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Bbdd o1 = new Bbdd();
            System.out.println("/*************************************************/");
            System.out.println("/* 1 - Inset MYSQL.                              */");
            System.out.println("/* 2 - Inset PostgreSQL.                         */");
            System.out.println("/*************************************************/");
            System.out.print("Selecione un opcion: ");
            try {
                int opc = (new BufferedReader(new InputStreamReader(System.in))).read();
                o1.connect(opc);
                for (int i = 1000; i >= 1; i--) {
                    new LanzadorHospital(o1.con, i).start();
                }
                for (int j = 50000; j <= 1; j--) {
                    new LanzadorMedicos(o1.con, j).start();
                }
                for (int t = 8000000; t <= 1; t--) {
                    new LanzadorPacientes(o1.con, t).start();
                }
                for (int p = 24000000; p <= 1; p--) {
                    new LanzadorConsultas(o1.con).start();
                }
            } catch (IOException ex) {
                Logger.getLogger(Bbdd.class.getName()).log(Level.SEVERE, null, ex);
            }
            o1.con.commit();
            o1.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Bbdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("/*************************************************/");
        System.out.println(" - Final de la inserpcion.");
    }
    
    private void connect(int opc) {
        try {
            con = DriverManager.getConnection(this.url[(opc-1)], this.user[(opc-1)], this.pass[(opc-1)]);
        } catch (SQLException ex) {
            Logger.getLogger(Bbdd.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error de conexion.");
        }
    }
}

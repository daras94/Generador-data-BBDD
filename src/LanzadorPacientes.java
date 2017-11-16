
import java.sql.Connection;

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
    
    public void run() {
        Paciente h = new Paciente(i);
    }
}

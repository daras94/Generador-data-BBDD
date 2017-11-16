
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
        Medico h = new Medico(i);
    }
}


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
        String n="hospital"+i;
        Hospital h= new Hospital(i,n);
    }
}

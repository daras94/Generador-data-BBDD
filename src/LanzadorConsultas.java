
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
public class LanzadorConsultas extends Thread{

    //Variables Globales.
    private Connection con = null;
    
    public LanzadorConsultas(Connection con) {
        this.con = con;
    }
    
    
    
    @Override
    public void run(){
        Consulta h= new Consulta();
        
    }
}

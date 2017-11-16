/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class LanzadorMedicos extends Thread{
     public void run(int i){
        
        Medico h= new Medico(i);
    }
}

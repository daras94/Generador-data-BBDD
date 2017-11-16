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
    
    
    
    
    public void run(int i){
        String n="hospital"+i;
        Hospital h= new Hospital(i,n);
    }
}

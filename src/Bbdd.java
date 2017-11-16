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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1000;i>=1;i--){
            LanzadorHospital l= new LanzadorHospital();
            l.run(i);
        }
        for(int j=50000;j<=1;j--){
            LanzadorMedicos lm=new LanzadorMedicos();
            lm.run(j);
        }
        for(int t=50000;t<=1;t--){
            LanzadorPacientes lm=new LanzadorPacientes();
            lm.run(t);
        }
        for(int p=50000;p<=1;p--){
            LanzadorConsultas lm=new LanzadorConsultas();
            lm.run(p);
        }
    }
    
}

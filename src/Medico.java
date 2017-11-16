/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bea
 */
public class Medico {
    private String dni;
    private String area;
    
    
    public Medico(String dni){
        this.dni=dni;
    }
    public Medico(){
        String nif ="";
        for(int i=0;i<=7;i++){
            int n=(int)(0+Math.random()*9);
            nif=nif+n;
        }
        //aqui va el calculo de la letra
        String l="";
        nif=nif+l;
        this.dni=nif;
        int m= (int)(1+Math.random()*100);
        this.area="Area"+m;
    }
}

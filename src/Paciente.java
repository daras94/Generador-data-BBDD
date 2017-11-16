/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bea
 */
public class Paciente {
    
    private String dni;
    public Paciente(String dni){
        this.dni=dni;
    }
    public Paciente(){
        String nif ="";
        for(int i=0;i<=7;i++){
            int n=(int)(0+Math.random()*9);
            nif=nif+n;
        }
        //aqui va el calculo de la letra
        String l="";
        nif=nif+l;
        this.dni=nif;
    }
}

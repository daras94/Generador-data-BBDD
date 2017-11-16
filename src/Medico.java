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
    private int dni;
    private String area;
    
    
    public Medico(int dni){
        this.dni=dni;
        int m= (int)(1+Math.random()*100);
        this.area="Area"+m;
    }
    
}

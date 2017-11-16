/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bea
 */
public class Consulta {

    private int mes;
    private int dni_paciente;
    private int dni_medico;
    private boolean prueba = false;
    private boolean operacion = false;

    public Consulta() {
        int dm=(int)(1+Math.random()*500000);
        this.dni_medico = dm;
        int dp=(int)(1+Math.random()*8000000);
        this.dni_paciente = dp;
        int mes = (int)(1 + Math.random() * 12);
        this.mes = mes;
        int prob = (int) (0 + Math.random() * 10);
        if (prob >= 6) {
            operacion=true;
        }
        if(prob>=4){
            prueba=true;
        }

    }
}

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
    private String dni_paciente;
    private String dni_medico;
    private boolean prueba = false;
    private boolean operacion = false;

    public Consulta(String dp, String dm) {
        this.dni_medico = dm;
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

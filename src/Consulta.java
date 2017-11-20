/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.util.*;
import java.math.*;
import java.sql.Date;
import java.sql.Time;
/**
 *
 * @author Bea
 */
public class Consulta {

    private BigDecimal mes;
    private BigDecimal numero_paciente;
    private BigDecimal numero_colegiado;
    private BigDecimal numero_consulta;
    private Date fecha;
    private Time hora;
    private String area;
    private BigDecimal sala;
    
    

    public Consulta(int i) {
        this.numero_consulta=new BigDecimal(i);
        int dm=(int)(1+Math.random()*500000);
        this.numero_colegiado = new BigDecimal(dm);
        int dp=(int)(1+Math.random()*8000000);
        this.numero_paciente = new BigDecimal(dp);
        int mes = (int)(1 + Math.random() * 12);
        this.mes = new BigDecimal(mes);
        int dia= (int)(1+Math.random()*28);
        this.fecha= new Date(dia,mes,2016);
        this.hora= new Time(((int)(1+Math.random()*24)),((int)(1+Math.random()*59)),0);
        this.area="Area"+((int)(1+Math.random()*100));
        this.sala=new BigDecimal(((int)(1+Math.random()*100)));
        
        int prob = (int) (0 + Math.random() * 10);
        if (prob >= 6) {
            Operacion o= new Operacion(i,this.fecha,this.hora,this.area,this.numero_colegiado);
        }
        if(prob>=4){
            Prueba p= new Prueba(this.numero_consulta,this.fecha,this.hora,this.area,this.numero_colegiado);
        }

    }
}

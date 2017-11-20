/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.math.*;
import java.sql.Time;
/**
 *
 * @author Bea
 */
public class Prueba {
    private BigDecimal numero_prueba;
    private Date fecha;//modificar
    private Time hora;
    private BigDecimal numero_consulta;
    private String area;
    private BigDecimal sala;
    private String observaciones;
    private BigDecimal numero_colegiado;
    //pa generar
    private String[] observacion={"no problemas","muerte segura","tomar medicamentos","a casa a llorar"};
    
    public Prueba(BigDecimal np,Date f,Time h,String area,BigDecimal nc){
        this.numero_prueba=np;
        this.numero_consulta=np;
        this.fecha=f;
        this.hora=h;
        this.area=area;
        this.numero_colegiado=nc;
        this.observaciones=observacion[(int)(0+Math.random()*3)];
        this.sala=new BigDecimal((int)(1+Math.random()*100));
        
        
    }
}

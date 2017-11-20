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
public class Operacion {
    private BigDecimal numero_operacion;
    private Date fecha;
    private Time hora;
    private BigDecimal numero_consulta;
    private BigDecimal numero_colegiado;
    private String area;
    private BigDecimal quirofano;
    private String observaciones;
    //generar
    private String[] observacion={"Todo ok","Muerte segura","drogas forever","coma pollo"};
    
    public Operacion(int i,Date fecha,Time t,String area, BigDecimal nc){
        this.numero_operacion= new BigDecimal(i);
        this.numero_consulta= new BigDecimal(i);
        this.quirofano=new BigDecimal((int)(1+Math.random()*500));
        this.observaciones=observacion[(int)(0+Math.random()*3)];
        this.fecha=fecha;
        this.hora=t;
        this.area=area;
        this.numero_colegiado=nc;
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.math.*;
/**
 *
 * @author Bea
 */
public class Hospital {
    private java.math.BigDecimal codigo;
    private String nombre;
    private String direccion;
    private java.math.BigDecimal codigo_postal;
    private String ciudad;
    private String provincia;
    private java.math.BigDecimal telefono;
    private String correo;
    private java.math.BigDecimal num_camas;
    //para generar
    private String[] ciudades={"Madrid","Alcala","Guadalajara","Torrejon"};
    private String[] codigos={"29006","34004","89234","23143"};
    private String[] vias={"Avenida", "calle","Glorieta","via"};
    private String[] calles={"Suarez","Mayor","Durazno","Abedul"};
    private String[] provincias={"Madrid","Orense","Malaga","Castellon"};
    
    public Hospital(int codigo,String nombre){
        String bd="";
        bd=bd+codigo;
        this.codigo=new BigDecimal(bd);
        this.nombre= nombre;
         this.ciudad=ciudades[((int)(0+Math.random()*4))];
        this.telefono= new BigDecimal(bd);
        this.codigo_postal= new BigDecimal(codigos[((int)(0+Math.random()*4))]);
        this.direccion= vias[((int)(0+Math.random()*4))]+" "+calles[((int)(0+Math.random()*4))];
        this.provincia=provincias[((int)(0+Math.random()*4))];
        this.correo="correito@"+nombre+".com";
        this.num_camas= new BigDecimal("100");
    }
}

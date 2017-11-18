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
public class Paciente {
    
    private String dni;
    private java.math.BigDecimal num_segsocial;
    private java.math.BigDecimal num_paciente;
    private String nombre;
    private String apellido;
    private String direccion;
    private java.math.BigDecimal codigo_postal;
    private String ciudad;
    private String provincia;
    private java.math.BigDecimal telefono;
    private java.math.BigDecimal num_historia_clinica;
    private String[] nombres={"Daniel","Juana","Pepe","Lola"};
    private String[] apellidos={"Fernandez","Lopez","Garcia","Sanchez"};
    private String[] ciudades={"Madrid","Alcala","Guadalajara","Torrejon"};
    private String[] codigos={"29006","34004","89234","23143"};
    private String[] vias={"Avenida", "calle","Glorieta","via"};
    private String[] calles={"Suarez","Mayor","Durazno","Abedul"};
    private String[] provincias={"Madrid","Orense","Malaga","Castellon"};
    
    public Paciente(int dni,String vuelta){
        this.dni=dni+vuelta;
        String bd="";
        bd=bd+dni;
        this.num_segsocial=new BigDecimal(bd);
        this.num_paciente= new BigDecimal(bd);
        this.nombre= nombres[((int)(0+Math.random()*4))];
        this.apellido= apellidos[((int)(0+Math.random()*4))]+" "+apellidos[((int)(0+Math.random()*4))];
        this.ciudad=ciudades[((int)(0+Math.random()*4))];
        this.telefono= new BigDecimal(bd);
        this.codigo_postal= new BigDecimal(codigos[((int)(0+Math.random()*4))]);
        this.num_historia_clinica= new BigDecimal(bd);
        this.direccion= vias[((int)(0+Math.random()*4))]+" "+calles[((int)(0+Math.random()*4))];
        this.provincia=provincias[((int)(0+Math.random()*4))];
        
    }
    
}


import java.math.BigDecimal;

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
    private java.math.BigDecimal dni;
    private String area;
    private java.math.BigDecimal num_segsocial;
    private java.math.BigDecimal num_colegiado;
    private String nombre;
    private String apellido;
    private String direccion;
    private java.math.BigDecimal codigo_postal;
    private String ciudad;
    private String provincia;
    private java.math.BigDecimal telefono;
    private String especialidad;
    private java.math.BigDecimal codigo_hospital;
    //para generar
     private String[] ciudades={"Madrid","Alcala","Guadalajara","Torrejon"};
    private String[] codigos={"29006","34004","89234","23143"};
    private String[] vias={"Avenida", "calle","Glorieta","via"};
    private String[] calles={"Suarez","Mayor","Durazno","Abedul"};
    private String[] provincias={"Madrid","Orense","Malaga","Castellon"};
    private String[] nombres={"Daniel","Juana","Pepe","Lola"};
    private String[] apellidos={"Fernandez","Lopez","Garcia","Sanchez"};
    private String[] especialidades={"ginecologia","cardiologia","dietista","odontologia"};
    
    public Medico(int dni,String vuelta){
        
        String bd="";
        bd=bd+dni;
        this.dni=new BigDecimal(bd+vuelta);
        int m= (int)(1+Math.random()*100);
        this.area="Area"+m;
        this.num_segsocial=new BigDecimal(bd);
        this.num_colegiado= new BigDecimal(bd);
        this.nombre= nombres[((int)(0+Math.random()*4))];
        this.apellido= apellidos[((int)(0+Math.random()*4))]+" "+apellidos[((int)(0+Math.random()*4))];
        this.ciudad=ciudades[((int)(0+Math.random()*4))];
        this.telefono= new BigDecimal(bd);
        this.codigo_postal= new BigDecimal(codigos[((int)(0+Math.random()*4))]);
        this.direccion= vias[((int)(0+Math.random()*4))]+" "+calles[((int)(0+Math.random()*4))];
        this.provincia=provincias[((int)(0+Math.random()*4))];
        this.especialidad=especialidades[((int)(0+Math.random()*4))];
        this.codigo_hospital=new BigDecimal(""+((int)(0+Math.random()*1000)));
    }
    
}

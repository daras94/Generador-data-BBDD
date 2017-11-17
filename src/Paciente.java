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
    private String direccion;
    private java.math.BigDecimal codigo_postal;
    private String ciudad;
    private String provincia;
    private java.math.BigDecimal telefono;
    private java.math.BigDecimal num_historia_clinica;
    
    
    
    public Paciente(int dni,String vuelta){
        this.dni=dni+vuelta;
        this.num_segsocial=dni;
        
        
    }
    
}

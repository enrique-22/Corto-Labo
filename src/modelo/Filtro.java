/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author LN710Q
 */
public class Filtro {
    
    private int id;
    private String N_Inscripcion;
    private String Nombre;
    private int Edad;
    private String Propietario;
    private boolean existencia;
    private String Raza;
   
    
    
    
    public Filtro(){
    }
    
    public Filtro(int id, String N_Inscripcion, String Nombre, int Edad, boolean existencia,String Raza,String Propietario){
        
        this.id = id;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.existencia =  existencia;
        this.N_Inscripcion = N_Inscripcion;
        this.Propietario = Propietario;
        this.Raza = Raza;
    }
    public Filtro(String N_Inscripcion, String Nombre, int Edad, boolean existencia){
        this.N_Inscripcion = N_Inscripcion;
        this.Nombre = Nombre;
        this.Edad  = Edad;
        this.existencia = existencia;
    }
    public Filtro(String Nombre, int Edad, boolean existencia){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.existencia = existencia;
    }

    public Filtro(int aInt, String string, String string0, int aInt0, boolean aBoolean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getN_Inscripcion() {
        return N_Inscripcion;
    }

    public void setN_Inscripcion(String N_Inscripcion) {
        this.N_Inscripcion = N_Inscripcion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public boolean getExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
        
    
    }
    public String getPropietario(){
       return Propietario;
        
    }
    public void setPropietario(String Propietario){
        this.Propietario = Propietario;
    }
   public String setRaza(){
       return Raza;
   }
   public void setRaza(String Raza){
       this.Raza = Raza;
   }
 
}

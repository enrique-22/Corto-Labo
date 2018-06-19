/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import interfaces.metodos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Filtro;

/**
 *
 * @author LN710Q
 */
public class FiltroDao implements metodos<Filtro> {
    
    private static final String SQL_INSERT = "INSERT INTO filtros_Inscripciones(codFiltro,nombre,edad,existencia)VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE filtros_INSCRIPCIONES SET nombre = ? edad, = ?,existencia = ? WHERE codFiltro=?"; 
    private static final String SQL_DELETE = "DELETE FROM filtros_INSCRIPCIONES WHERE codFiltro=?";
    private static final String SQL_CREATE = "CREATE FROM filtros_INSCRIPCIONES WHERE codFiltro=?";
    private static final String SQL_SEARCH = "SEARCH FROM filtros_INSCRIPCIONES WHERE codFiltro=?";
     private static final String SQL_READ = "SELECT * FROM filtros_INSCRIPCIONES WHERE codFiltro=?";
    private static final String SQL_READALL = "SELECT *FROM filtros_INSCRIPCIONES";
    private static final Conexion con = Conexion.conectar();

    @Override
    public boolean create(Filtro g) {
        PreparedStatement ps;
         try {
            ps = con.getCnx().prepareStatement(SQL_INSERT);
            ps.setString(1,g.getN_Inscripcion());
            ps.setString(2, g.getNombre());
            ps.setInt(3, g.getEdad());
            ps.setBoolean(4, true);
            if(ps.executeUpdate() > 0){
               return true;
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            Logger.getLogger(FiltroDao.class.getName()).log(Level.SEVERE, null, ex);
            
        }finally{
            con.cerrarConexion();
        }
       return false;
    }

    
    @Override
    public boolean insert(Filtro d) {
   PreparedStatement ps;
        try {
            ps = con.getCnx().prepareStatement(SQL_INSERT);
            ps.setString(1,d.getN_Inscripcion());
            ps.setString(2, d.getNombre());
            ps.setInt(3, d.getEdad());
            ps.setBoolean(4, true);
            if(ps.executeUpdate() > 0){
               return true;
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            Logger.getLogger(FiltroDao.class.getName()).log(Level.SEVERE, null, ex);
            
        }finally{
            con.cerrarConexion();
        }
       return false;
    }

    
    @Override
    public boolean delete(Object key) {
        
           PreparedStatement ps;
        try{
            ps = con.getCnx().prepareStatement(SQL_DELETE);
            ps.setString(1,key.toString());
            
            if (ps.executeUpdate() > 0){
                return true;
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            Logger.getLogger(FiltroDao.class.getName()).log(Level.SEVERE, null,ex);
            
        }finally{
            con.cerrarConexion();
        }
        return false;
    }
    

    @Override
    public boolean update(Filtro c) {
        
  PreparedStatement ps;
        try{
            System.out.println(c.getN_Inscripcion());
            ps = con.getCnx().prepareStatement(SQL_UPDATE);
            ps.setString(1, c.getNombre());
            ps.setInt(2, c.getEdad());
            ps.setString(4, c.getN_Inscripcion());
            if(ps.executeUpdate() > 0){
                return true;
            }
            
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            Logger.getLogger(FiltroDao.class.getName()).log(Level.SEVERE, null, ex);
            
        }finally{
                    con.cerrarConexion();
                    }
        return false;
    }
    

    @Override
    public boolean search(Filtro f) {
          PreparedStatement ps;
        try{
            System.out.println(f.getN_Inscripcion());
            ps = con.getCnx().prepareStatement(SQL_SEARCH);
            ps.setString(1, f.getNombre());
            ps.setInt(2, f.getEdad());
            ps.setString(4, f.getN_Inscripcion());
            if(ps.executeUpdate() > 0){
                return true;
            }
            
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            Logger.getLogger(FiltroDao.class.getName()).log(Level.SEVERE, null, ex);
            
        }finally{
                    con.cerrarConexion();
                    }
        return false;
    }

    @Override
    public Filtro read(Object key) {
        Filtro f = null;
        PreparedStatement ps;
        ResultSet rs;
        try{
            ps = con.getCnx().prepareStatement(SQL_READ);
            ps.setString(1, key.toString());
            
            rs = ps.executeQuery();
            
            while (rs.next()){
                f = new Filtro(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getBoolean(5));
                
            }
            rs.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            Logger.getLogger(FiltroDao.class.getName()).log(Level.SEVERE,null,ex);
            
        }finally{
            con.cerrarConexion();
        }
        
        return f;
    }
       

    @Override
    public ArrayList<Filtro> readAll() {
        
  ArrayList<Filtro> all=new ArrayList();
        Statement s;
        ResultSet rs;
        try{
            s = con.getCnx().prepareStatement(SQL_READALL);
            rs = s.executeQuery(SQL_READALL);
            while(rs.next()){
                all.add(new Filtro(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getInt(4),rs.getBoolean(5)));
                
            }
            rs.close();
            
        }catch(SQLException ex){
            Logger.getLogger(FiltroDao.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        
        return all;
    }

    
}



    
    
    

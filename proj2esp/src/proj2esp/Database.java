/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj2esp;

/**
 *
 * @author Adriana Cerqueira
 */

import java.util.List;
import javafx.scene.control.Alert;
import org.hibernate.Session;

public class Database {
    
    // Return types
    public static final int SUCCESS = 0;
    public static final int NULL_POINTER = 1;
    public static final int CONNECTION_ERROR = 2;
    
    public static class ListReturn{
        public int code;
        public List list;
        public ListReturn(int code, List list){
            this.code = code;
            this.list = list;
        }
    };
    
    // Update database
    public static int update(Object obj){
        
        Session session ;
        session = HibernateUtil.getSessionFactory().openSession();
        
        try{
            session.beginTransaction();
            session.update(obj);
            session.getTransaction().commit();
        }
        catch(NullPointerException ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("No momento nao foi possivel actualizar os dados na base de dados!");
            alert.show();
            
            return NULL_POINTER;
        }
        catch(Exception ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("No momento nao foi possivel aceder a  base de dados!");
            alert.show();
            
            return CONNECTION_ERROR;
        }
        finally{
            session.flush();
            session.close();
        }
        
        return SUCCESS;
    }
    
    // Save to database
    public static int save(Object obj){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        try{
            session.beginTransaction();
            session.save(obj);
            session.getTransaction().commit();
        }
        catch(NullPointerException ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("No momento nÃ£o foi possivel guardar os dados na base de dados!");
            alert.show();
            
            return NULL_POINTER;
        }
        catch(Exception ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("No momento nÃ£o foi possivel aceder Ã  base de dados!");
            alert.show();
            
            return CONNECTION_ERROR;
        }
        finally{
            session.flush();
            session.close();
        }
        
        return SUCCESS;
    }
    
    // Delete from database
    public static int delete(Object obj){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try{
            session.beginTransaction();
            session.delete(obj);
            session.getTransaction().commit();
        }
        catch(NullPointerException ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("No momento nÃ£o foi possivel eliminar os dados da base de dados!");
            alert.show();
            
            return NULL_POINTER;
        }
        catch(Exception ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("No momento nÃ£o foi possivel aceder Ã  base de dados!");
            alert.show();
            
            return CONNECTION_ERROR;
        }
        finally{
            session.flush();
            session.close();
        }
        
        return SUCCESS;
    }
    
    public static Session getSession(){
        try {
            return HibernateUtil.getSessionFactory().openSession();
        } 
        catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("No momento nÃ£o foi possivel aceder Ã  base de dados!");
            alert.show();
            return null;
        }
    }
    
    public static void closeSession(Session session){
        session.flush();
        session.close();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj2esp;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author USER
 */
public class HibernateUtil{
    
    public static SessionFactory sessionfactory;
    private static ServiceRegistry builder;
    
    static{
        try{
            //sessionfactory = new Configuration().configure().buildSessionFactory();
            Configuration configuration = new Configuration().configure("/proj2esp/hibernate.cfg.xml");
            builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionfactory = configuration.buildSessionFactory(builder);
        }catch(Throwable e){
            System.out.println("Erro na criação do Session Factory: " + e.getMessage());
            //throw new ExceptionInInitializerError(e);
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return sessionfactory;
    }
    
    public static void close() throws Exception{
        if(builder != null) {
            StandardServiceRegistryBuilder.destroy(builder);
        }
    }
}

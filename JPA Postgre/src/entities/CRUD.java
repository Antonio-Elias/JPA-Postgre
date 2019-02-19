/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.EntityManager;

/**
 *
 * @author Antonio
 */
public class CRUD {
    
    EntityManager entityManager = JpaUtil.getEntityManager();
        
    public void setObject(Object obj) throws Exception{
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(obj);
            entityManager.getTransaction().commit();
        }catch (Exception ex){
            if(entityManager.isOpen()){
                entityManager.getTransaction().rollback();
            }
            System.out.println(ex.getMessage());
        }finally{
            if(entityManager.isOpen()){
                entityManager.close();
                
            }
        }
    }

    public void updateObject(Object obj) throws Exception{
        try{
            entityManager.getTransaction().begin();
            obj = entityManager.merge(obj);
            entityManager.getTransaction().commit();
        }catch (Exception ex){
            if(entityManager.isOpen()){
                entityManager.getTransaction().rollback();
            }
            System.out.println(ex.getMessage());
        }finally{
            if(entityManager.isOpen()){
                entityManager.close();
                
            }
        }
    }
    
    public Object findObject(long id){
        Categoria obj = null;
        try{
            obj = entityManager.find(Categoria.class, id);
        }catch (Exception ex){
            if(entityManager.isOpen()){
                entityManager.getTransaction().rollback();
            }
            System.out.println(ex.getMessage());
        }/*finally{
            if(entityManager.isOpen()){
                entityManager.close();
                
            }
        }*/
        return obj;
    }
    
    public boolean removeObject(Object obj){
        try{
            entityManager.getTransaction().begin();
            entityManager.remove(obj);
            entityManager.getTransaction().commit();
            return true;
        }catch (Exception ex){
            if(entityManager.isOpen()){
                entityManager.getTransaction().rollback();
            }
            System.out.println(ex.getMessage());
            return false;
        }finally{
            if(entityManager.isOpen()){
                entityManager.close();
                
            }
        }
    }
            
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import entities.Categoria;
import entities.CRUD;

/**
 *
 * @author Antonio
 */
public class TesteJPA {
    public static void main(String[] args) throws Exception{
        Categoria cat = new Categoria();
        cat.setDescricao("teste");
        cat.setStatus(0);
        cat.setId(10);
        
        CRUD crud = new CRUD();
        //crud.setObject(cat);
        System.out.println(crud.toString());
        //crud.updateObject(cat);
        //CRUD crude = new CRUD();
        //System.out.println(crude.toString());
        //long lo = 12;
        //Categoria categ = (Categoria)crud.findObject(lo);
        //System.out.println("Nome Categoria: " + categ.getDescricao());
        
        System.out.println(crud.removeObject(cat) ? "Removido":"Não Encontrado");
        System.exit(0);
    }
}
        
        
        
        

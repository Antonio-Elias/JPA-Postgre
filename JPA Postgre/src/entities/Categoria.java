/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Antonio
 */
@Entity

public class Categoria implements Serializable {
    
    //public static final String SEQUENCE_NAME = "SEQUENCE_CATEGORIA";
    @Id
    /*@SequenceGenerator(name = SEQUENCE_NAME,
                    sequenceName = SEQUENCE_NAME,
                    initialValue = 1,
                    allocationSize = 50)*/
    @GeneratedValue(strategy = GenerationType.IDENTITY/*, generator = "SEQUENCE_NAME"*/)
    private long id;
    private String descricao;
    private int status;

    public Categoria() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}

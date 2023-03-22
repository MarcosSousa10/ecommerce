package com.unyleya.dto;

import java.io.Serializable;

import com.unyleya.ecommerce.domain.Produto;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String preco;
    public UserDTO() {
    }
    public UserDTO(Produto obj) {
        id = obj.getId();
        name = obj.getName();
        preco = obj.getPreco();
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPreco() {
        return preco;
    }
    public void setPreco(String preco) {
        this.preco = preco;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.login;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Yi Min
 */
@Named(value = "login")
@RequestScoped
public class LoginBean {
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }
    
    public void login(){
        
        
    }
    
}

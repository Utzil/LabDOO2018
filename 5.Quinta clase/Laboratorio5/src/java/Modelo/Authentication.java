/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author uziel
 */
public class Authentication {
      
    public static boolean Authenticate(String username, String password){
        
        String userDataBase="Uziel";
        String passwordDataBase="123";
        
        if(username.equals(userDataBase) && password.equals(passwordDataBase)){
            return true;
        }else{
            return false;
        }
    }  
}

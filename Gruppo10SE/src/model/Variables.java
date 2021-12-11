/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.*;

/**
 *
 * @author mazzy
 */
public class Variables {
    
 private Map<Character,CartesianComplex> variables;
    
    public Variables() {
        variables = new HashMap<>(26);
        for(int i = 97; i<=122;i++){
            variables.put((char)i, new CartesianComplex(0,0));
        }
    }
    
    public boolean isEmpty() {
        return variables.isEmpty();
    }
    
    public int size() {
        return variables.size();
    }
    
    public CartesianComplex getValue(char key) {
       if(variables.isEmpty()){
             return null;}
       
        if( variables.keySet().contains(key)){
            CartesianComplex value = variables.get(key);
            return value;
        }   
        else return null;
    }
    
    public CartesianComplex putValue(char variable, CartesianComplex cartCompl) {
        if(variables.containsKey(variable)){
            return variables.replace(variable,cartCompl);
        }
        else return variables.put(variable,cartCompl);   
    }
    
    public Integer removeValue(char variable) {
        if(variables.isEmpty()){
            return 0;}
        else 
            variables.replace(variable, new CartesianComplex(0,0));
        return 1;
    }
    
    public boolean searchValue(CartesianComplex cartCompl){
        if(variables.isEmpty()){
             return false;}
        
        for(char s : variables.keySet()){
            if ( variables.get(s).equals(cartCompl)){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.variables);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Variables other = (Variables) obj;
        if (!Objects.equals(this.variables, other.variables)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
         String append = "";
         CartesianComplex zero = new CartesianComplex(0, 0);
        for( char i : variables.keySet()){
        
            append+=  i +"  =  "+ getValue(i)+"\n";
    }
        return append;
    }

    
}

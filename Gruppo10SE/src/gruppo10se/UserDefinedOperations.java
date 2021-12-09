/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo10se;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author mazzy
 */
public class UserDefinedOperations {
    private Map<String,String> operations;
    
    public UserDefinedOperations() {
        operations = new LinkedHashMap<>();
    } 
    
    public boolean isEmpty() {
        return operations.isEmpty();
    }
    
    public int size() {
        return operations.size();
    }
    
    public String getValue(String key) {
       if(operations.isEmpty()){
             return null;}
       
        if( operations.keySet().contains(key)){
            String value = operations.get(key);
            return value;
        }   
        else return null;
    }
    
    public Integer getKeyIndex(String key ) {
        
       if(operations.isEmpty()){
             return null;}
       
       int i=0;
       for(String k: operations.keySet()){
           if (k == key){
               return i;
           }
           i+=1;            
       }
 
       return null;
    }
    
    public String putValue(String name, String func) {
        operations.putIfAbsent(name, func);
     return operations.get(name);
    }
    
    public Integer removeValue(String name) {
        if(operations.isEmpty()){
            return 0;}
        else 
            operations.replace(name, " ");
        return 1;
    }
    
    public boolean searchValue(String func){
        if(operations.isEmpty()){
             return false;}
        
        for(String s : operations.keySet()){
            if ( operations.get(s).equals(func)){
                return true;
            }
        }
        return false;
    }
    
    public Set<String> keySet() {
        
        return operations.keySet();

}
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.operations);
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
        final UserDefinedOperations other = (UserDefinedOperations) obj;
        if (!Objects.equals(this.operations, other.operations)) {
            return false;
        }
        return true;
    }
   
    @Override
    public String toString() {
         String append = "";
         String func = new String();
        for( String s : operations.keySet()){
            
            if( ! (getValue(s).equals(func)))
                append+=  s +"  =  "+ getValue(s)+"\n";
    }
        return append;
    }

}

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
/**
 * Creation of the Variables class for the handling of 26 variables from a to z
 * in a Map-type data structure.
 */
public class Variables {

    private Map<Character, CartesianComplex> variables;

    /**
     * Constructor of the Variables class, Constructs an HashMap instance filled
     * with 26 variables initialized to a CartesianComplex equals to 0.
     */
    public Variables() {
        variables = new HashMap<>(26);
        for (int i = 97; i <= 122; i++) {
            variables.put((char) i, new CartesianComplex(0, 0));
        }
    }

    /**
     * Checks if the map has no mappings.
     *
     * @return true if this map contains no key-value mappings.
     */
    public boolean isEmpty() {
        return variables.isEmpty();
    }

    /**
     * Calculate the size of the map.
     *
     * @return the number of mappings in this map.
     */
    public int size() {
        return variables.size();
    }

    /**
     * Retrieves the value mapped to the specified key.
     *
     * @param key is the character whose mapped value is to be obtained
     * @return the CartesianComplex object value to which the specified key is
     * mapped, or null if this map contains no mapping for the key or it is
     * empty.
     */
    public CartesianComplex getValue(char key) {
        if (variables.isEmpty()) {
            return null;
        }

        if (variables.keySet().contains(key)) {
            CartesianComplex value = variables.get(key);
            return value;
        } else {
            return null;
        }
    }

    /**
     * Creates a key-value mapping associating the specified key to the
     * specified value.
     * 
     * @param variable is the key of the mapping
     * @param cartCompl
     * @return the value to which the key is mapped.
     */
    public CartesianComplex putValue(char variable, CartesianComplex cartCompl) {
        if (variables.containsKey(variable)) {
            return variables.replace(variable, cartCompl);
        } else {
            variables.put(variable, cartCompl);
        }
        return variables.get(variable);
    }

    /**
     * Removes a key-value mapping associated to the specified key.
     *
     * @param variable is the key of the mapping to replace with a
     * CartesianComplex object equals to 0
     * @return 1 if the value has been successfully replaced or 0 if the map is
     * empty or it doesn't contain the specified key.
     */
    public Integer removeValue(char variable) {
        if (variables.isEmpty()) {
            return 0;
        } else {
            variables.replace(variable, new CartesianComplex(0, 0));
        }
        return 1;
    }

    /**
     * Search in the map the specified value.
     *
     * @param cartCompl is the value to be searched in this map.
     * @return true if this map contains the specified value, or false if the
     * map is empty or there is no mapping for the value.
     */
    public boolean searchValue(CartesianComplex cartCompl) {
        if (variables.isEmpty()) {
            return false;
        }

        for (char s : variables.keySet()) {
            if (variables.get(s).equals(cartCompl)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method overrides the hashCode() method of Object class inherited
     * from AbstractMap Class.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.variables);
        return hash;
    }

    /**
     * This method overrides the equals() method of Object class inherited from
     * AbstractMap Class.
     */
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

    /**
     * This method overrides the toString() method of Object class inherited
     * from AbstractMap Class.
     */
    @Override
    public String toString() {
        String append = "";
        CartesianComplex zero = new CartesianComplex(0, 0);
        for (char i : variables.keySet()) {

            append += i + "  =  " + getValue(i) + "\n";
        }
        return append;
    }

}

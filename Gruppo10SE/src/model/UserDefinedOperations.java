/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author mazzy
 */
/**
 * Creation of the UserDefinedOperation class for the handling of user defined
 * operation in a Map-type data structure.
 */
public class UserDefinedOperations {

    private Map<String, String> operations;

    /**
     * Constructor of the UserDefinedOperation class, Constructs an empty
     * insertion-ordered LinkedHashMap instance.
     */
    public UserDefinedOperations() {
        operations = new LinkedHashMap<>();
    }

    /**
     * Checks if the map has no mappings.
     *
     * @return true if this map contains no key-value mappings.
     */
    public boolean isEmpty() {
        return operations.isEmpty();
    }

    /**
     * Calculate the size of the map.
     *
     * @return the number of mappings in this map.
     */
    public int size() {
        return operations.size();
    }

    /**
     * Retrieves the value mapped to the specified key.
     *
     * @param key is the key whose mapped value is to be obtained
     * @return the value to which the specified key is mapped, or null if this
     * map contains no mapping for the key or it is empty.
     */
    public String getValue(String key) {
        if (operations.isEmpty()) {
            return null;
        }

        if (operations.keySet().contains(key)) {
            String value = operations.get(key);
            return value;
        } else {
            return null;
        }
    }

    /**
     * Calculates the index of a key-value mapping in the map.
     *
     * @param key is the key whose mapped value is to be obtained
     * @return the index to which the mapping is located, or null if this map
     * doesn't contain the specified key or is empty.
     */
    public Integer getKeyIndex(String key) {

        if (operations.isEmpty()) {
            return null;
        }

        int i = 0;
        for (String k : operations.keySet()) {
            if (k == key) {
                return i;
            }
            i += 1;
        }

        return null;
    }

    /**
     * Creates a key-value mapping associating the specified key to the
     * specified value.
     *
     * @param name is the key of the mapping
     * @param func is the value of the mapping
     * @return the value to which the key is mapped.
     */
    public String putValue(String name, String func) {
        operations.putIfAbsent(name, func);
        return operations.get(name);
    }

    /**
     * Removes a key-value mapping associated to the specified key.
     *
     * @param name is the key of the mapping to replace with the value " "
     * @return 1 if the value has been successfully replaced or 0 if the map is
     * empty or it doesn't contain the specified key.
     */
    public Integer removeValue(String name) {
        if (operations.isEmpty() || !operations.keySet().contains(name)) {
            return 0;
        } else {
            operations.replace(name, " ");
        }
        return 1;
    }

    /**
     * Search in the map the specified value.
     *
     * @param func is the value to be searched in this map.
     * @return true if this map contains the specified value, or false if the
     * map is empty or there is no mapping for the value.
     */
    public boolean searchValue(String func) {
        if (operations.isEmpty()) {
            return false;
        }

        for (String s : operations.keySet()) {
            if (operations.get(s).equals(func)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns a set of the keys contained in this map.
     *
     * @return a set of strings representing the keys contained in this map.
     */
    public Set<String> keySet() {
        return operations.keySet();
    }

    /**
     * This method overrides the hashCode() method of Object class inherited
     * from AbstractMap Class.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.operations);
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
        final UserDefinedOperations other = (UserDefinedOperations) obj;
        if (!Objects.equals(this.operations, other.operations)) {
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
        String func = new String();
        for (String s : operations.keySet()) {

            if (!(getValue(s).equals(func))) {
                append += s + "  =  " + getValue(s) + "\n";
            }
        }
        return append;
    }

}

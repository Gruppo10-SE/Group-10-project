/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.util.ArrayList;

/**
 * This class gives an implementation of the stack data structure
 * @author user
 * @param <T>
 */
public class StackDataStructure<T> {

    private List<T> stack;
    
    public StackDataStructure() {
        stack = new ArrayList<>();
    }
    
    /**
     * Checks if the stack is empty
     * @return true if stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    /**
     * Returns the number of elements inside the stack
     * @return the size of the stack
     */
    public int size() {
        return stack.size();
    }
    
    /**
     * Returns the top element of the stack
     * @return the element on the top of the stack, if stack is not empty
     */
    public T top() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.get(size() - 1);
    }
    
    /**
     * Takes the element on the top of the stack and removes it
     * @return the removed element, if stack is not empty
     */
    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        T top = top();
        stack.remove(top);
        return top;
    }
    
    /**
     * Pushes an element on the top of the stack
     * @param element to be pushed 
     */
    public void push(T element) {
        stack.add(element);
    }

    /**
     * Looks for the index of a given element into the stack
     * @param element to be searched
     * @return index of the element, if stack is not empty
     */
    public Integer search(T element) {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.indexOf(element);
    }
    
    /**
     * Removes all the elements from the stack
     */
    public void clear() {
        stack.clear();
    }

    /**
     * Removes an element from the top of the stack without returning it
     */
    public void drop() {
        this.pop();
    }

    /**
     * Swap the element on the top with the one below
     */
    public void swap() {
        T last = pop();
        T secondLast = pop();
        push(last);
        push(secondLast);
    }
    
    /**
     * Pushes a copy of the element below the top element of the stack
     */
    public void over() {
        T last = pop();
        T secondLast = top();
        push(last);
        push(secondLast);
    }

    /**
     * Pushes a copy of the element on the top of the stack
     */
    public void dup() {
        T top = top();
        push(top);
    }

    /**
     * Represents the stack data structure
     * @return the representation of the stack
     */
    @Override
    public String toString() {
        String append = "";
        for (int i = stack.size() - 1; i >= 0; i--) {
            append += stack.get(i) + "\n";
        }
        return append;
    }

}

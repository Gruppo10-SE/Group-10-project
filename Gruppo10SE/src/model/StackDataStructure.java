/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author user
 * @param <T>
 */
public class StackDataStructure<T> {

    private List<T> stack;

    public StackDataStructure() {
        stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public T top() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.get(size() - 1);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        T top = top();
        stack.remove(top);
        return top;
    }

    public void push(T element) {
        stack.add(element);
    }

    public Integer search(T element) {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.indexOf(element);
    }

    public void clear() {
        stack.clear();
    }

    public void drop() {
        this.pop();
    }

    public void swap() {
        T last = pop();
        T secondLast = pop();
        push(last);
        push(secondLast);
    }

    public void over() {
        T last = pop();
        T secondLast = top();
        push(last);
        push(secondLast);
    }

    public void dup() {
        T top = top();
        push(top);
    }

    @Override
    public String toString() {
        String append = "";
        for (int i = stack.size() - 1; i >= 0; i--) {
            append += stack.get(i) + "\n";
        }
        return append;
    }

}

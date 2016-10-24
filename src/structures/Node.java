/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

/**
 *
 * @author Atif Hassan
 * @param <T>
 */
public class Node<T> {

    private T data;
    private Node<T> pointer;

    /**
     * creates a new null node
     */
    public Node() {
        data = null;
        pointer = null;
    }

    /**
     *
     * @param element
     */
    public Node(T element) {
        data = element;
        pointer = null;
    }

    /**
     *
     * @param element
     * @param pointer
     */
    public Node(T element, Node<T> pointer) {
        data = element;
        this.pointer = pointer;
    }

    /**
     *
     * @return
     */
    public T getData() {
        return data;
    }

    /**
     *
     * @param data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     *
     * @return
     */
    public Node<T> getPointer() {
        return pointer;
    }

    /**
     *
     * @param pointer
     */
    public void setPointer(Node<T> pointer) {
        this.pointer = pointer;
    }

}

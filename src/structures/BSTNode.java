/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

/**
 *
 * @author Atif Hassan
 * @param <E>
 */
public class BSTNode<E extends Comparable<E>> {
    private E data;
    private BSTNode<E> left;
    private BSTNode<E> right;

    public BSTNode(E data) {
        this.data = data;
        left = null;
        right = null;
    }

    public BSTNode(E data, BSTNode<E> left, BSTNode<E> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public BSTNode<E> getLeft() {
        return left;
    }

    public void setLeft(BSTNode<E> left) {
        this.left = left;
    }

    public BSTNode<E> getRight() {
        return right;
    }

    public void setRight(BSTNode<E> right) {
        this.right = right;
    }
    
    
    
}

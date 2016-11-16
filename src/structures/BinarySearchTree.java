/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import Exceptions.EmptyException;
import Exceptions.NullElementException;
import Interfaces.BSTInterface;

/**
 *
 * @author Atif Hassan
 * @param <E>
 */
public class BinarySearchTree<E extends Comparable<E>> implements BSTInterface<E> {

    private int size = 0;
    private E data;
    private BinarySearchTree<E> root;
    private BinarySearchTree<E> currentPointer;
    private BinarySearchTree<E> previousPointer;
    private BinarySearchTree<E> left;
    private BinarySearchTree<E> right;

    /**
     *
     */
    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(E data) {
        this.data = data;
    }

    public BinarySearchTree(E data, BinarySearchTree<E> left, BinarySearchTree<E> right) {
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

    /**
     *
     * @param element
     */
    @Override
    public void Add(E element) {
        //currentPointer = root;
        //previousPointer = currentPointer;
        if (isEmpty()) {
            setData(element);
        } else //right branch
        {
            if (element.compareTo(getData()) <= 0) {
                left = new BinarySearchTree();
                left.Add(element);
            } //left branch
            else {
                right = new BinarySearchTree();
                right.Add(element);
            }
        }
        size++;
    }

    /**
     *
     * @param element
     * @return
     * @throws EmptyException
     * @throws Exceptions.NullElementException
     */
    @Override
    public E Remove(E element) throws EmptyException, NullElementException {
        while (left != null) {
            //right branch
            if (element.compareTo(left.getData()) > 0) {
                right = left;
                left = left.getRight();
                right.setRight(left);
            } //left branch
            else if (element.compareTo(left.getData()) < 0) {
                right = left;
                left = left.getLeft();
                right.setLeft(left);
            } //equals branch
            else {
                if (right.getRight() == left) {
                    left = left.getRight();
                    right.setRight(left);
                } else {
                    left = left.getLeft();
                    right.setLeft(left);
                }
                size--;
                return element;
            }
        }
        throw new NullElementException();
    }

    /**
     *
     * @param element
     * @return
     */
    @Override
    public boolean Contains(E element) throws EmptyException {
        if (element.equals(getData())) {
            return true;
        } else if (!isEmpty())//right branch
        {
            if (element.compareTo(getData()) <= 0) {
                if (getLeft() == null) {
                    return false;
                }
                left.Contains(element);
            } //left branch
            else {
                if (getRight().isEmpty()) {
                    return false;
                }
                right.Contains(element);
            }
        } else {
            throw new EmptyException();
        }
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    /**
     *
     * @return
     */
    @Override
    public int Size() {
        return size;
    }

    /**
     *
     * @param element
     * @return
     * @throws EmptyException
     * @throws Exceptions.NullElementException
     */
    @Override
    public E Get(E element) throws EmptyException, NullElementException {
        if (!isEmpty()) {
            throw new EmptyException();
        }
        if (!Contains(element)) {
            throw new NullElementException();
        } else {
            return element;
        }
    }

    /**
     *
     */
    @Override
    public void Reset() {
        root = null;
        left = root;
        right = left;
        size = 0;
    }

    /**
     *
     * @return @throws EmptyException
     */
    @Override
    public E getNext() throws EmptyException {
        return root.getRight().getData();
    }

    @Override
    public String toString() {
        String list = "";
        if (!isEmpty()) {
            list += getLeft().toString();
            list += root.toString();
            list += getRight().toString();
        }
        return list;
    }

    public BinarySearchTree<E> getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTree<E> left) {
        this.left = left;
    }

    public BinarySearchTree<E> getRight() {
        return right;
    }

    public void setRight(BinarySearchTree<E> right) {
        this.right = right;
    }

}

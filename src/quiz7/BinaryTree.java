/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz7;

import generaltree.Tree;
import positionexample.Position;

/**
 *
 * @author user
 */
public interface BinaryTree <E> extends Tree<E> {
    public Position<E> left(Position<E> p) throws IllegalArgumentException;
    public Position<E> right(Position<E> p) throws IllegalArgumentException;
    public Position<E> sibling(Position<E> p) throws IllegalArgumentException;
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTree;

/**
 *
 * @author DELL
 */
import RTree.geometry.Geometry;

import java.util.List;



public interface NonLeaf<T, S extends Geometry> extends Node<T, S> {

    Node<T, S> child(int i);

    /**
     * Returns a list of children nodes. For accessing individual children the
     * child(int) method should be used to ensure good performance. To avoid
     * copying an existing list though this method can be used.
     * 
     * @return list of children nodes
     */
    List<Node<T, S>> children();
    
    default boolean isLeaf() {
        return false;
    }
    
}

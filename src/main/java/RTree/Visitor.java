/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTree;

import RTree.geometry.Geometry;

/**
 *
 * @author DELL
 */
public interface Visitor<T, S extends Geometry> {

    void leaf(Leaf<T, S> leaf);

    void nonLeaf(NonLeaf<T, S> nonLeaf);

}

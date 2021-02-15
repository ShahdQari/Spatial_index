/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTree;


import RTree.geometry.Geometry;
import RTree.*;

public interface EntryFactory<T,S extends Geometry> {
    Entry<T,S> createEntry(T value, S geometry);
}
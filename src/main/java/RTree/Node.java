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
import RTree.geometry.HasGeometry;
import RTree.geometry.Geometry;
import RTree.*;
import java.util.List;
import RTree.internal.NodeAndEntries;


public interface Node<T, S extends Geometry> extends HasGeometry {

    List<Node<T, S>> add(Entry<? extends T, ? extends S> entry);

    NodeAndEntries<T, S> delete(Entry<? extends T, ? extends S> entry, boolean all);

    int count();

    Context<T, S> context();
    
    boolean isLeaf();

}
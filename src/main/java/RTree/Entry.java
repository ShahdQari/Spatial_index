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
import RTree.internal.EntryDefault;


public interface Entry<T, S extends Geometry> extends HasGeometry {

    T value();

    @Override
    S geometry();
    
    public static <T, S extends Geometry> Entry<T,S> entry(T object, S geometry) {
        return EntryDefault.entry(object, geometry);
    }

}

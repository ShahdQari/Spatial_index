/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTree;


import RTree.geometry.Geometry;
import static java.util.Collections.min;
import RTree.internal.Comparators;
import java.util.List;


public final class SelectorMinimalOverlapVolume implements Selector {
    
    public static final SelectorMinimalOverlapVolume INSTANCE = new SelectorMinimalOverlapVolume();
    
    private SelectorMinimalOverlapVolume() {
    }

    @Override
    public <T, S extends Geometry> Node<T, S> select(Geometry g, List<? extends Node<T, S>> nodes) {
        return min(nodes,
                Comparators.overlapVolumeThenVolumeIncreaseThenVolumeComparator(g.mbr(), nodes));
    }

}
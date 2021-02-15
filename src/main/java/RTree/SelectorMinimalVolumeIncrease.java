/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTree;

import RTree.geometry.Geometry;
import RTree.internal.Comparators;

import java.util.List;

import static java.util.Collections.min;

public final class SelectorMinimalVolumeIncrease implements Selector {

    public static final SelectorMinimalVolumeIncrease INSTANCE = new SelectorMinimalVolumeIncrease();

    private SelectorMinimalVolumeIncrease() {
    }

    @Override
    public <T, S extends Geometry> Node<T, S> select(Geometry g, List<? extends Node<T, S>> nodes) {
        return min(nodes, Comparators.volumeIncreaseThenVolumeComparator(g.mbr()));
    }
}
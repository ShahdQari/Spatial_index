/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTree.internal;

/**
 *
 * @author DELL
 */
import RTree.geometry.Geometry;
import RTree.internal.NonLeafDefault;
import RTree.internal.LeafDefault;
import RTree.*;
import java.util.List;
public final class FactoryDefault<T, S extends Geometry> implements Factory<T, S> {

    private static class Holder {
        private static final Factory<Object, Geometry> INSTANCE = new FactoryDefault<Object, Geometry>();
    }

    @SuppressWarnings("unchecked")
    public static <T, S extends Geometry> Factory<T, S> instance() {
        return (Factory<T, S>) Holder.INSTANCE;
    }

    @Override
    public Leaf<T, S> createLeaf(List<Entry<T, S>> entries, Context<T, S> context) {
        return new LeafDefault<T, S>(entries, context);
    }

    @Override
    public NonLeaf<T, S> createNonLeaf(List<? extends Node<T, S>> children, Context<T, S> context) {
        return new NonLeafDefault<T, S>(children, context);
    }

    @Override
    public Entry<T, S> createEntry(T value, S geometry) {
        return Entry.entry(value, geometry);
    }

}

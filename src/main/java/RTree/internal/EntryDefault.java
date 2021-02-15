/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTree.internal;

import RTree.packge.Objects;
import RTree.packge.Preconditions;
import RTree.geometry.Geometry;
import RTree.*;
import RTree.internal.utill.ObjectsHelper;


/**
 *
 * @author DELL
 */
public final class EntryDefault<T, S extends Geometry> implements Entry<T, S> {
    private final T value;
    private final S geometry;

    /**
     * Constructor.
     * 
     * @param value
     *            the value of the entry
     * @param geometry
     *            the geometry of the value
     */
    public EntryDefault(T value, S geometry) {
        Preconditions.checkNotNull(geometry);
        this.value = value;
        this.geometry = geometry;
    }

    /**
     * Factory method.
     * 
     * @param <T>
     *            type of value
     * @param <S>
     *            type of geometry
     * @param value
     *            object being given a spatial context
     * @param geometry
     *            geometry associated with the value
     * @return entry wrapping value and associated geometry
     */
    public static <T, S extends Geometry> Entry<T, S> entry(T value, S geometry) {
        return new EntryDefault<T, S>(value, geometry);
    }

    /**
     * Returns the value wrapped by this {@link EntryDefault}.
     * 
     * @return the entry value
     */
    @Override
    public T value() {
        return value;
    }

    @Override
    public S geometry() {
        return geometry;
    }

    @Override
    public String toString() {
        String builder = "Entry [value=" + value + ", geometry=" + geometry + "]";
        return builder;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value, geometry);
    }

    @Override
    public boolean equals(Object obj) {
        @SuppressWarnings("rawtypes")
        EntryDefault other = ObjectsHelper.asClass(obj, EntryDefault.class);
        if (other != null) {
            return Objects.equal(value, other.value)
                    && Objects.equal(geometry, other.geometry);
        } else
            return false;
    }

}
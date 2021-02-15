/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTree.packge;

/**
 *
 * @author DELL
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public final class Iterators {

    private Iterators() {
        // prevent instantiation
    }

    /**
     * Adds all elements in {@code iterator} to {@code collection}. The iterator
     * will be left exhausted: its {@code hasNext()} method will return
     * {@code false}.
     *
     * @param addTo
     *            collection to add to
     * @param iterator
     *            iterator whose elements will be added to the collection
     * @param <T>
     *            generic type of collection
     * @return {@code true} if {@code collection} was modified as a result of
     *         this operation
     */
    public static <T> boolean addAll(Collection<T> addTo, Iterator<? extends T> iterator) {
        Preconditions.checkNotNull(addTo);
        Preconditions.checkNotNull(iterator);
        boolean wasModified = false;
        while (iterator.hasNext()) {
            wasModified |= addTo.add(iterator.next());
        }
        return wasModified;
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTree.packge;



import java.util.Collection;

public final class Collections2 {

    private Collections2() {
        // prevent instantiation
    }

    /**
     * Used to avoid http://bugs.sun.com/view_bug.do?bug_id=6558557
     * 
     * @param iterable
     *            input
     * @param <T>
     *            generic type of collection
     * @return input cast as collection
     */
    static <T> Collection<T> cast(Iterable<T> iterable) {
        return (Collection<T>) iterable;
    }
}
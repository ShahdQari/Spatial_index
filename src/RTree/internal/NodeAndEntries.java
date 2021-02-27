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
import RTree.Entry;
import RTree.Node;
import RTree.geometry.Geometry;
import java.util.List;
import java.util.Optional;
public final class NodeAndEntries<T, S extends Geometry> {

    private final Optional<? extends Node<T, S>> node;
    private final List<Entry<T, S>> entries;
    private final int count;

    /**
     * Constructor.
     * 
     * @param node
     *            absent = whole node was deleted present = either an unchanged
     *            node because of no removal or the newly created node without
     *            the deleted entry
     * @param entries
     *            from nodes that dropped below minChildren in size and thus
     *            their entries are to be redistributed (readded to the tree)
     * @param countDeleted
     *            count of the number of entries removed
     */
    public NodeAndEntries(Optional<? extends Node<T, S>> node, List<Entry<T, S>> entries,
            int countDeleted) {
        this.node = node;
        this.entries = entries;
        this.count = countDeleted;
    }

    public Optional<? extends Node<T, S>> node() {
        return node;
    }

    public List<Entry<T, S>> entriesToAdd() {
        return entries;
    }

    public int countDeleted() {
        return count;
    }

}
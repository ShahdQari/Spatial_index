/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTree.internal.utill;

public final class Pair<T> {

    private final T value1;
    private final T value2;

    public Pair(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T value1() {
        return value1;
    }

    public T value2() {
        return value2;
    }

}

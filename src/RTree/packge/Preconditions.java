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
public final class Preconditions {

    private Preconditions() {
        // prevent instantiation
    }

    public static <T> T checkNotNull(T t) {
        return checkNotNull(t, null);
    }

    public static <T> T checkNotNull(T t, String message) {
        if (t == null)
            throw new NullPointerException(message);
        return t;
    }

    public static void checkArgument(boolean b, String message) {
        if (!b)
            throw new IllegalArgumentException(message);
    }

    public static void checkArgument(boolean b) {
        if (!b)
            throw new IllegalArgumentException();
    }

}
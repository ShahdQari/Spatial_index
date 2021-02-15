/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTree.internal.utill;
import RTree.packge.VisibleForTesting;

/**
 *
 * @author DELL
 */
public final class ObjectsHelper {

    private ObjectsHelper() {
        // prevent instantiation
    }

    @VisibleForTesting
    static void instantiateForTestCoveragePurposesOnly() {
        new ObjectsHelper();
    }

    @SuppressWarnings("unchecked")
    public static <T> T asClass(Object object, Class<T> cls) {
        if (object == null)
            return null;
        else if (object.getClass() != cls)
            return null;
        else
            return (T) object;
    }

}
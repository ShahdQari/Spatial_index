/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTree.geometry;

/**
 *
 * @author DELL
 */
import RTree.geometry.internal.PointDouble;
import java.util.List;

public interface Point extends Rectangle {

    double[] mins();
    
    default double[] maxes() {
        return mins();
    }
    
    default double[] values() {
        return mins();
    }
    
    public static Point create(double... x) {
        return PointDouble.create(x);
    }
    
    public static Point create(List<? extends Number> x) {
        double[] a = new double[x.size()];
        for (int i = 0; i< x.size(); i++) {
            a[i] = x.get(i).doubleValue();
        }
        return create(a);
    }

}
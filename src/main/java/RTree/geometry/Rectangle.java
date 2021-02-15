/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTree.geometry;
import RTree.geometry.internal.RectangleDouble;
import RTree.packge.Preconditions;


/**
 *
 * @author DELL
 */
public interface Rectangle extends Geometry, HasGeometry {

    float x1();

    float y1();

    float x2();

    float y2();

    float area();

    Rectangle add(Rectangle r);

    boolean contains(double x, double y);

    float intersectionArea(Rectangle r);

    float perimeter();

}
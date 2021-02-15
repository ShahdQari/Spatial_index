/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTree.geometry;
import RTree.internal.Util;
/**
 *
 * @author DELL
 */

import RTree.*;
import java.util.List;
public class Group<T extends HasGeometry> implements HasGeometry {

    private final List<T> list;
    private final Rectangle mbr;

    public Group(List<T> list) {
        this.list = list;
        this.mbr = Util.mbr(list);
    }

    public List<T> list() {
        return list;
    }

    @Override
    public Geometry geometry() {
        return mbr;
    }

}
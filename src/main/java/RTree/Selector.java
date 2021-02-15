/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTree;

/**
 *
 * @author DELL
 */
import RTree.geometry.Geometry;
import RTree.*;
import java.util.List;

public interface Selector {

    <T, S extends Geometry> Node<T, S> select(Geometry g, List<? extends Node<T, S>> nodes);

}
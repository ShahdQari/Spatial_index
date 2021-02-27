/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTree;

import RTree.geometry.Rectangle;
final class RectangleDepth {
    private final Rectangle rectangle;
    private final int depth;

    RectangleDepth(Rectangle rectangle, int depth) {
        super();
        this.rectangle = rectangle;
        this.depth = depth;
    }

    Rectangle getRectangle() {
        return rectangle;
    }

    int getDepth() {
        return depth;
    }

}
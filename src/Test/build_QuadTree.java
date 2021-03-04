/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.FileInputStream;
import quadTree.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

// Please run this class as 
public class build_QuadTree {

    //OldQuadTree quadTree;
    static QuadTree quadTree;
    Point point;

    public static void main(String[] args) throws IOException {

        build_QuadTree test = new build_QuadTree();
        quadTree = test.loadQuadTree();

    }

    private QuadTree loadQuadTree() throws IOException {
        quadTree = new QuadTree(new Rectangle(-180, -90, 180, 90), 1);
        FileInputStream inputStream = null;
        Scanner sc = null;
        Vector<Point> sample = new Vector<>();

        
        try {
            inputStream = new FileInputStream("C:\\Users\\DELL\\Desktop\\University\\graduation project2\\workers_Skewed_Distribution.txt");
            sc = new Scanner(inputStream, "UTF-8");

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] sections = line.split(";");
                point = new Point(Double.parseDouble(sections[1]), Double.parseDouble(sections[2]));
                sample.add(point);
            }
               
                quadTree.packInRectangles(sample.toArray(new Point[sample.size()]));

            
            if (sc.ioException() != null) {
                throw sc.ioException();
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (sc != null) {
                sc.close();
            }
        }

        return quadTree;
    }

}

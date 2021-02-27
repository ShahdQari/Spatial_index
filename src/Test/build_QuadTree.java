/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import quadTree.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

// Please run this class as 
public class build_QuadTree {

    //OldQuadTree quadTree;
    static QuadTree quadTree;
    private static final String CACHE_NAME = "FileCache";
    /**
     * Heap size required to run this example.
     */
    public static final int MIN_MEMORY = 512 * 1024 * 1024;

    public static void main(String[] args) throws IOException {

        build_QuadTree test = new build_QuadTree();
        quadTree = test.loadQuadTree();

    }

    private QuadTree loadQuadTree() throws IOException {
        //quadTree = new OldQuadTree(25, 3, 0, 0, 0, 10000, 10000, null);
        quadTree = new QuadTree(new Rectangle(-180, -90, 180, 90), 1);

        try {
            Scanner s = new Scanner(new File("C:\\Users\\DELL\\Desktop\\University\\graduation project2\\t.txt"));

//Scanner s = new Scanner(new File("C:\\Users\\-\\Downloads\\objectCoordinates.txt"));
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] sections = line.split(";");
                double longitude = Double.parseDouble(sections[1]);
                double latitude = Double.parseDouble(sections[2]);
                Point p = new Point();
                p.set(longitude, latitude);
                Point[] p1 = {p};

                quadTree.packInRectangles(p1);

                //quadTree.insert(quadTreeObject);
            }
            s.close();

            //map.put(1, quadTree);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return quadTree;
    }

}

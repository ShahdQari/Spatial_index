/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package build;

import RTree.RTree;
import RTree.geometry.Geometry;
import RTree.geometry.Point;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class build_Rtree {

    RTree<String, Geometry> tree;

    public static void main(String[] args) throws IOException {

        build_Rtree test = new build_Rtree();
        //RTree.create();    
        // RTree<String, Geometry> tree1 = RTree.star().maxChildren(6).create();

        test.rtree(new File("C:\\Users\\DELL\\Desktop\\University\\graduation project2\\workers_Uniform_Distribution.txt"),
                "C:\\Users\\DELL\\Desktop\\University\\graduation project2\\uniform_RTree.png",
                new File("C:\\Users\\DELL\\Desktop\\University\\graduation project2\\data_Uniform_RTree.txt"));

    }

    public RTree rtree(File file, String phote, File Writer) throws IOException {
        try {
            Scanner s = new Scanner(file);

            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] sections = line.split(";");
                String Id = sections[0];
                double longitude = Double.parseDouble(sections[1]);
                double latitude = Double.parseDouble(sections[2]);
                tree = RTree.star().maxChildren(6).create();
                tree.add(Id, Point.create(longitude, latitude));
            }
                System.out.println(tree.asString());
                tree.visualize(600, 600).save(phote);
                BufferedWriter out = new BufferedWriter(new FileWriter(Writer));
                out.write(tree.asString());
                out.newLine();
            
            s.close();

            //map.put(1, quadTree);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return tree;

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;


import RTree.*;
import RTree.geometry.Geometry;
import RTree.geometry.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Test1{
    RTree<String, Geometry> tree ;
    
    

        
	public static void main(String [] args) throws IOException {
		
		Test1 test= new Test1();
                test.rtree();
                                        
    }
      
   
	    public RTree rtree() throws IOException {	
                tree = RTree.create();                
		try {
			Scanner s = new Scanner(new File("C:\\Users\\DELL\\Desktop\\University\\graduation project2\\workers_Skewed_Distribution.txt"));
                         
			while(s.hasNextLine()) {
				String line = s.nextLine();
				String [] sections = line.split(";");
                                String Id = sections[0];
				double longitude = Double.parseDouble(sections[1]);
				double latitude = Double.parseDouble(sections[2]);
                                tree = tree.add(Id, Point.create(longitude, latitude));
                               System.out.println(tree.asString());
                               tree.visualize(600,600).save("C:\\Users\\DELL\\Desktop\\University\\graduation project2\\mytree.png");
                               
                            
                                
			}
                        s.close();
                        
			//map.put(1, quadTree);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                return tree;
   
	} 
  
    }

    


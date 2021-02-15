/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import RTree.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {
    static RTree rtree;
    
    
    
    private RTree loadQuadTree() throws IOException {

	 	
		try {
			Scanner s = new Scanner(new File("C:\\Users\\DELL\\Desktop\\University\\graduation project2\\t.txt"));
                         
			while(s.hasNextLine()) {
				String line = s.nextLine();
				String [] sections = line.split(";");
				int longitude = Integer.parseInt(sections[1]);
				int latitude = Integer.parseInt(sections[2]);
                                rtree = new RTree(longitude,latitude);
                                rtree.insert();

                            
                                
			}
                        s.close();
                        
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
                
        return rtree;
	}
        
    
}

package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class ShapesTest {
	
	public static void main(String[] args) {
		
		
		try {
			
			Shape cylinder = new Cylinder(6f, 4f);
			Shape cuboid = new Cuboid(2f, 2f, 2f);
			Shape sphere = new Sphere(9.6f);
			
			cuboid.render();
			cylinder.render();
			sphere.render();
			
			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Please enter valid information. The number must be greater than 0.");
		
		}
	}
	
}
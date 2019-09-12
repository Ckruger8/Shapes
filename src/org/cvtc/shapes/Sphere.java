package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Caleb Kruger
 *
 */
public class Sphere extends Shape{
	
	//Attribute
	private float radius;

	
	//Constructors
	public Sphere() {
		
	}
	
	public Sphere(float radius) {
		setRadius(radius);
	}
	
	
	//Setter and Getter
	
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		
		if (radius <= 0) {
			throw new IllegalArgumentException();
		} else {
			this.radius = radius;
		}
	}

	
	
	
	@Override
	public float surfaceArea() {
		return  (float) (4 * Math.PI * (radius * radius));
	}

	@Override
	public float volume() {
		return (float) ((4 * (Math.PI * (radius * radius * radius))) / 3);
	}

	@Override
	public void render() {

		JOptionPane.showMessageDialog(null,
									"Radius: " + radius +
									"\nSurface Area: " + surfaceArea() +
									"\nVolume: " + volume(),
									"Sphere",
									JOptionPane.PLAIN_MESSAGE);
	}
	
	
	
	
}
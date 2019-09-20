package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Caleb Kruger
 *
 */
public class Cylinder extends Shape {
	
	//Attributes
	private float radius;
	private float height;

	
	// Constructors
	public Cylinder() {
		
	}
	
	public Cylinder(float radius, float height) {
		super();
		this.radius = (radius > 0) ? radius : 1 ;
		this.height = (height > 0) ? height : 1 ;
	}

	// Setters and Getters
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		
		if ( radius <= 0) {
			throw new IllegalArgumentException();
		} else {
			this.radius = radius;
		}
		
	}

	
	
	public float getHeight() {
		return height;
	}

	private void setHeight(float height) {
		
		if ( height <= 0 ){
			throw new IllegalArgumentException();
		} else {
			this.height = height;
		}
	}

	
	
	
	@Override
	public float surfaceArea() {
		return (float) (2 * Math.PI * (radius * radius) + 2 * Math.PI * radius * height);
	}

	@Override
	public float volume() {
		return (float) (Math.PI * (radius * radius) * height);
	}

	@Override
	public void render() {
		JOptionPane.showMessageDialog(null,
									"Radius: " + radius +
									"\nHeight: " + height +
									"\nSurface Area: " + surfaceArea() +
									"\nVolume: " + volume(),
									"Cylinder",
									JOptionPane.PLAIN_MESSAGE);

		
	}
	
	
	
	
}

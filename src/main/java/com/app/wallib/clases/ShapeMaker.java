package com.app.wallib.clases;

import org.springframework.beans.factory.annotation.Autowired;

public class ShapeMaker {
	
	@Autowired
	public Circulo circ;
	
	@Autowired
	public Rectangulo rect;
	
	@Autowired
	public Cuadrado cuad;
	
	public ShapeMaker() {
        circ = new Circulo();
        rect = new Rectangulo();
        cuad = new Cuadrado();
    }
	
	public void drawCircle() {
		circ.draw();
		
	}
	
	public void drawRectangle() {
		rect.draw();
		
	}
	
	public void drawSquare() {
		cuad.draw();
		
	}
	

}

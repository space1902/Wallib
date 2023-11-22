package com.app.wallib;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.wallib.clases.ShapeMaker;

@SpringBootApplication
public class FacadeDemo {

	public static void main(String[] args) {
		
		ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
	}

}

package com.mycompany.ejercicioedd3;

/**
 * It contains the data of a triangle and allows us to calculate its area.
 * @author Marcos Unzueta Puente
 * @version 1.0
 */
public class Triangle {
    private float base;
    private float height;
    private float variableErronea;
    
    
    public Triangle() {
        
    }

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }
    
    
/**
 * This function returns the value of the area of the triangle.
 * @return area of the triangle.
 */
    float calculateArea(){
        return (base * height)/2;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    
    
}

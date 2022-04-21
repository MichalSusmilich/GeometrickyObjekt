/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometrickyobjekt.withInterface;

/**
 *
 * @author michal.susmilich
 */
public class Circle implements Computable{
    private double r;
    
    public Circle(double r){
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" + "r=" + r + '}';
    }

    public double getR() {
        return r;
    }
    @Override
    public double area(){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        Circle c = new Circle(3);
        System.out.println(c.area());
    }
}

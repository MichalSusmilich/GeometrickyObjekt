/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometrickyobjekt.withInterface;

/**
 *
 * @author michal.susmilich
 */
public class Ractangle implements Computable{
    private double a;

    public Ractangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    private double b;
    

    @Override
    public String toString() {
        return "Ractangle{" + "a=" + a + ", b=" + b + '}';
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    public double calculateArea(){
        return a*b;
    }
    public static void main(String[] args) {
        Ractangle r = new Ractangle(2,6);
        System.out.println(r.calculateArea());
    }

    @Override
    public double area() {
        return calculateArea();
    }
}

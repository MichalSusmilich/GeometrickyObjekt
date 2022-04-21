/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometrickyobjekt.withInterface;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author michal.susmilich
 */
public class GeometrickyObjekt {

   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int type;
        ArrayList<Computable> shapes = new ArrayList<>();
        while((type = sc.nextInt()) != 0){
            if(type == 1){
                shapes.add(new Circle(sc.nextDouble()));
            }else{
                shapes.add(new Ractangle(sc.nextDouble(), sc.nextDouble()));
            }
        }
        double area = 0;
        for (Computable shape : shapes) {
            area += shape.area();//Polymorfismus
           /* if (shape instanceof Circle){
                ((Circle)shape).area();
            }else if()*/
        }
        System.out.println(area);
    }
    
    
}

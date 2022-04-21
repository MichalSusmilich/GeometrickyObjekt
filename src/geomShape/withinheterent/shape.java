/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geomShape.withinheterent;

/**
 *
 * @author michal.susmilich
 */
public abstract class shape {
    protected String name = "Geometric shape";
    public String getName(){
        return this.getClass().getSimpleName();
    }
    public abstract double area();/*{
        //return 0;
    }*/
}

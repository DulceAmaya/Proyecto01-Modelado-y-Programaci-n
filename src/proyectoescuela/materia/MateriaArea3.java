/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoescuela.materia;

import java.util.ArrayList;
import proyectoescuela.profesor.Profesor;

/**
 *
 * @author dulf2
 */
public abstract class MateriaArea3 extends Materia {
    
    ArrayList<Profesor> profesores;
    
    public MateriaArea3(){
        super();
    }
        
    @Override
    public String getArea(){
        return "Ciencias Sociales";
    }
    
    
}
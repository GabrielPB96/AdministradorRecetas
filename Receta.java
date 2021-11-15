 


import java.text.Normalizer;
import java.util.*;

/**
 * Write a description of class Receta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Receta {
    private String titulo;
    private HashMap<Integer, String> preparacion;
    private HashSet<Ingrediente> ingredientes;
    
    /**
     * autor -> object?? , review(reseña){comentario, estrellita, autor} -> objeto ??
     */
    
    public Receta(String titulo, HashSet<Ingrediente> ingredientes) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
    }
    
    public int contarIngredientesContenidos(String[] ingredientes) {
        int contenidos = 0;
        ingredientes = ConvertRobot.standardizeArray(ingredientes);
        for(String i: ingredientes) {
            for(Ingrediente e: this.ingredientes) {
                if(i.equals(e.getNombre())) {
                    contenidos++;
                }
            }
        }
        return contenidos;
    }
    
    public boolean ingresarIngredientes(String[] nuevosIngredientes) {    
        return true;
    }
}

    


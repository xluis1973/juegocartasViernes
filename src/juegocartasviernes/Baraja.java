/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocartasviernes;

import java.util.List;
import java.util.Stack;

/**
 *
 * @author agus1
 */
public class Baraja {
    private Stack<Carta> cartas; 
    private List<Carta> monton;
    
    public Baraja(){
        for (Palo palo : Palo.values()) {
            for (Numero i : Numero.values()) {
                cartas.push(new Carta(palo, i));
                
            }
        }
        System.out.print("Baraja creada con exito");
}
}

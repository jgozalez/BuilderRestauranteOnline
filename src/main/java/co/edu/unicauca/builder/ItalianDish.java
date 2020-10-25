/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.builder;

/**
 *
 * @author Camilo Gonzalez
 */
public class ItalianDish extends Dish {

    private String paisOrigen;

    public ItalianDish(String name, String description, String image, int price, EnumSize size, String paisOrigen) {
        super(name, description, image, price, size);
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

}

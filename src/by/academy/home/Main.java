package by.academy.home;

import by.academy.home.box.Box;
import by.academy.home.box.Cone;
import by.academy.home.box.Cylindrical;
import by.academy.home.box.Square;
import by.academy.home.deck.AbctractDeck;
import by.academy.home.deck.Deck;
import by.academy.home.ship.AbstractShip;
import by.academy.home.ship.Ship;


import java.util.ArrayList;

public class Main {
    public static ArrayList<AbstractShip> port = new ArrayList<>();
    private static final int DENSITY_SMALL=1000;
    private static final int DENSITY_LARGE=2000;

    public static void main(String[] args) throws Exception {
        Main.createShips();
        Output();


    }

    public static void createShips() throws Exception {

        Box box1 = new Square(100, "big", DENSITY_SMALL);
        Box box2 = new Cone(20, "big", 2000);
        Box box3 = new Cylindrical(10, "little", DENSITY_LARGE);
        Box box4 = new Cylindrical(20, "little", DENSITY_SMALL);
        Box box5 = new Cylindrical(30, "little", DENSITY_LARGE);
        Box box6 = new Cylindrical(40, "little", DENSITY_LARGE);
        AbctractDeck deck1 = new Deck(box1, box2);
        AbctractDeck deck2 = new Deck(box3, box4, box5, box6);
        AbstractShip ship1 = new Ship(deck1, deck2);
        port.add(ship1);

        Box box7 = new Square(100, "big", DENSITY_SMALL);
        Box box8 = new Cone(20, "big", 2000);
        AbctractDeck desk3 = new Deck(box7, box8);
        AbstractShip ship2 = new Ship(desk3);
        port.add(ship2);

        Box box9 = new Cylindrical(10, "little", DENSITY_LARGE);
        Box box10 = new Cylindrical(10, "little", DENSITY_LARGE);
        Box box11 = new Cylindrical(10, "little", DENSITY_LARGE);
        Box box12 = new Cylindrical(10, "little", DENSITY_LARGE);
        AbctractDeck desk4 = new Deck(box9, box10, box11, box12);
        AbstractShip ship3 = new Ship(desk4);
        port.add(ship3);

    }


    public static void Output(){
        System.out.println(port);
        int n = 0;
        for (AbstractShip array: port){
            n+= array.getWater();
        }
        System.out.println("The mass of all water in the port" + n);
    }

}



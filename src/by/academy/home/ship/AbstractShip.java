package by.academy.home.ship;

import by.academy.home.deck.AbctractDeck;

import java.util.ArrayList;

public abstract class AbstractShip {

    ArrayList<AbctractDeck> ships = new ArrayList<>();

    public AbstractShip(AbctractDeck desk1) {
        ships.add(desk1);

    }

    public AbstractShip(AbctractDeck deck1, AbctractDeck deck2) {
        ships.add(deck1);
        ships.add(deck2);
    }
    public int getWater(){
        int n = 0;
        for (AbctractDeck array: ships){
            n+= array.getWater();
        }
        return n;
    }
    public void Limitation(){
        int a = 1;
        if (a==10){
            throw new IllegalArgumentException("The port can accommodate a maximum of 10 ships");
        } else {
            a++;
        }
    }

    @Override
    public String toString() {
        return "\nThis ship has  - " + ships.size() + " deck " + ships;
    }
}

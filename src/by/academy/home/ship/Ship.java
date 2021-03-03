package by.academy.home.ship;

import by.academy.home.deck.AbctractDeck;

public class Ship extends AbstractShip{

    public Ship (AbctractDeck deck1){
        super(deck1);
        Limitation();
    }
    public Ship (AbctractDeck deck1,AbctractDeck deck2){
        super(deck1,deck2);
        Limitation();
    }
}

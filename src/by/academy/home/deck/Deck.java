package by.academy.home.deck;

import by.academy.home.box.Box;

public class Deck extends AbctractDeck{

   public Deck (Box box1, Box box2) throws Exception {
       super(box1,box2);

   }
    public Deck (Box box1, Box box2,Box box3, Box box4) throws Exception {
        super(box1,box2,box3,box4);

    }
}

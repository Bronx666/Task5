package by.academy.home.deck;

import by.academy.home.box.Box;

import java.util.ArrayList;

public abstract class AbctractDeck {
    ArrayList<Box> arr = new ArrayList<Box>();




    public AbctractDeck (Box box1, Box box2) throws Exception {
        if (box1.getSize().equals("big")&&box2.getSize().equals("big")){
            arr.add(box1);
            arr.add(box2);
        } else {
            throw new Exception("The deck can be either 2 large boxes or 4 small ones");
        }
    }

    public AbctractDeck (Box box1, Box box2, Box box3,Box box4) throws Exception {
        if (box1.getSize().equals("little")&&box2.getSize().equals("little")&&
                box3.getSize().equals("little")&&box4.getSize().equals("little")){
            arr.add(box1);
            arr.add(box2);
            arr.add(box3);
            arr.add(box4);

        } else {
            throw new Exception("The deck can be either 2 large boxes or 4 small ones");
        }
    }

    public int getWater() {
        int n = 0;
        for (Box array: arr){
            n+= array.getWater();
        }
        return n;
    }
    @Override
    public String toString() {
        return "\nThere are " +arr.size() +" boxes on this deck " + arr;

    }


}

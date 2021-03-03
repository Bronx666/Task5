package by.academy.home.box;

public class Square implements Box{
    private int side;
    private String size;
    private int height;
    private int density;
    private int val;

    public Square(int height, String size, int density) {

        if (height > 100 || height < 10) {
            throw new IllegalArgumentException("Хуйня, давай по новой c высотой");
        } else {    this.height = height;   }

        this.side = switch (size) {
            case "big" -> 20;
            case "little" -> 10;
            default -> throw new IllegalArgumentException("Хуйня, давай по новой c размером");
        };
        this.size = size;

        this.density = switch (density) {
            case 1000 -> 1000;
            case 2000 -> 2000;
            default -> throw new IllegalArgumentException("Хуйня, давай по новой c плотностью");
        };

        val = getMass(this.side,this.height,this.density);
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public int getMass(int height, int side, int density) {
        return ((side*side*height)*density);
    }


    @Override
    public String toString() {
        return size+"\n box contains "+val+" liters of water ";
    }

    @Override
    public int getWater() {
        return val;
    }
}



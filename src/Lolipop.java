import java.util.ArrayList;

public class Lolipop extends Sweets {

    String color;

    public Lolipop(int weight, String name, int price, String color) {
        super(weight, name, price);
        this.color=color;
    }

    public String getColor(){
        return color;
    }




}

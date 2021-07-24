import java.util.ArrayList;

public class Marmalade extends Sweets {

    String taste;

    public Marmalade(int weight, String name,  int price, String taste) {
        super(weight, name,  price);
        this.taste=taste;
    }

    public String getTaste(){
        return  taste;
    }


}
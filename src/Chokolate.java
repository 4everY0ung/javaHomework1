public class Chokolate extends  Sweets{

    String type;

    public Chokolate(int weight, String name, int price, String type) {
        super(weight, name, price);
        this.type=type;
    }

    public String getType(){
        return type;
    }

}

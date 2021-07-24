public abstract class Sweets {
    private int weight;
    private String name;
    private int price;

    public Sweets(int weight, String name, int price){
        this.weight=weight;
        this.name=name;
        this.price=price;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public int getPrice(){
        return price;
    }

    public String info(Sweets sweets){
        return null;
    }

}

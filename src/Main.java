import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sweets> newSweetsBox = new ArrayList<>();
        Chokolate mars = new Chokolate(25, "Mars", 100, "Milk");
        Lolipop bonPari = new Lolipop(5, "BonPari", 10, "Red");
        Chokolate milka = new Chokolate(20,"Milka",90,"Dark");
        Lolipop bonBon = new Lolipop(6,"BonBon", 12, "Blue");
        Marmalade bears = new Marmalade(11,"Bears", 12, "Sour");
        Marmalade cars = new Marmalade(53, "Cars", 20, "Sweet");
        newSweetsBox.add(mars);
        newSweetsBox.add(bonPari);
        newSweetsBox.add(milka);
        newSweetsBox.add(bonBon);
        newSweetsBox.add(bears);
        newSweetsBox.add(cars);

        for (Sweets sweet : newSweetsBox) {
            System.out.println(info(sweet));
        }
        System.out.println("Итоговоая сумма коробки: " + getPriceOfBox(newSweetsBox));
        System.out.println("Итоговый вес коробки: " + getWeightOfBox(newSweetsBox));
        deleteSweet(newSweetsBox);
        for (Sweets sweet : newSweetsBox) {
            System.out.println(info(sweet));
        }
    }

    public static String info(Sweets sweet) {
        String result = null;
        if (sweet instanceof Chokolate) {
            result = sweet.getName() + " " + sweet.getWeight() + " " + sweet.getPrice() + " " + ((Chokolate) sweet).getType();
        } else if (sweet instanceof Lolipop)
            result = sweet.getName() + " " + sweet.getWeight() + " " + sweet.getPrice() + " " + ((Lolipop) sweet).getColor();
        else if (sweet instanceof Marmalade) {
            result = sweet.getName() + " " + sweet.getWeight() + " " + sweet.getPrice() + " " + ((Marmalade) sweet).getTaste();
        }
        return result;
    }

    public static int getPriceOfBox(ArrayList<Sweets> sweetBox){
        int sum =0;
        for (Sweets sweets: sweetBox){
            sum+=sweets.getPrice();
        }
        return sum;
    }

    public static int getWeightOfBox(ArrayList<Sweets> sweetBox){
        int weight =0;
        for (Sweets sweets: sweetBox){
            weight+=sweets.getWeight();
        }
        return weight;
    }

    public static void  deleteSweet(ArrayList<Sweets> sweetBox){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите индекс");
        int index = scanner.nextInt();
        boolean isCorrect = false;
        while (isCorrect!= true){
            if( index > (sweetBox.size()-1)){
                System.out.println("Значение индекса выходит за границы массива. Пожалуйста ввидите корректный идекс");
                index = scanner.nextInt();
            }else {
                isCorrect=true;
            }
        }
        sweetBox.remove(index);
    }

}


import java.util.*;

public class Cars {
    public static void main(String[] args) {
        HashMap<String, String> carBrand = new HashMap<>();

        carBrand.put("Nissan", "Sentra");
        carBrand.put("Fiat", "Abarth");
        carBrand.put("Jeep", "Sahara");
        carBrand.put("Peugeot", "Peugeot 108");

        Scanner carType = new Scanner(System.in);

          System.out.println("Hi can I help you find a car today?");
          String name = carType.nextLine();
          System.out.println("What brand of car are you looking for today?");


          String myCar = carType.nextLine();
          if (carBrand.containsKey(myCar)){

       System.out.println("We have " + myCar + " let's go for a test drive!");
          }else System.out.println("I'm sorry,you'll have to go to another car dealer.");

    }
}

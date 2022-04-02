import java.util.ArrayList;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Double>> menu = new HashMap<>();
        ArrayList<Double> mohitoPrice = new ArrayList<>();
        mohitoPrice.add(350.0); //RUR
        mohitoPrice.add(15.50); //USD
        mohitoPrice.add(13.20); //EUR
        menu.put("Koktail Mohito", mohitoPrice);


        System.out.println(menu);
        System.out.println("GitHub connected");
    }
}

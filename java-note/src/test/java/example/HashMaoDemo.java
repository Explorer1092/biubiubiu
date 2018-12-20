package example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaoDemo {
    public static void main(String[] agrs) {
//        创建一个hash mapDemo
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("Zara", 3434.34);
        hm.put("Manna", 123.22);
        hm.put("Alan", 1378.00);
        hm.put("Daisy", 99.22);
        hm.put("Quad's", -19.08);

        // Get a set of the entries
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        // Get an iterator
        // Display elements
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        // Deposit 1000 into Zara's account
        double balance = hm.get("Zara");
        hm.put("Zara", balance + 1000);
        System.out.println("Zara's new balance: " +
                hm.get("Zara"));
    }
}



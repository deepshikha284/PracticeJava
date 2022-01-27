package dsa.hashing;

import java.util.HashMap;

public class Hashmap3 {
    public static void main(String[] args) {
        HashMap<String, Integer> m
                = new HashMap<>();

        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("courses", 20);

        if (m.containsValue(15))
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println(m.get("ide"));

        System.out.println(m.get("practice"));
    }
}




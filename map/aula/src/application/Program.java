package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Map<String, String> cookies = new HashMap<>();

        cookies.put("name", "Jose Meurer");
        cookies.put("age", "24");
        cookies.put("phone", "9 9999-9999");
        cookies.put("email", "jose@gmail.com");
        cookies.put("address", "rua jose jose, 999");

        cookies.remove("address");

        cookies.put("age", "32");

        System.out.println("All cookies:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

        System.out.println();
        System.out.println(cookies.values());
        System.out.println("Contains 'email' key: " + cookies.containsKey("email"));
        System.out.println("UserName: " + cookies.get("name"));
        System.out.println("Contains 'jose@gmail.com: " + cookies.containsValue("jose@gmail.com"));
        System.out.println("Size: " + cookies.size());

    }
}

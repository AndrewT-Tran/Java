import java.util.HashMap;
import java.util.Set;

public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("andrew@me.com", "Andrew");
        // The first argument to put is the key (in this case, an email address),
        // the second argument is the value (in this case, a name).
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");

        String name = userMap.get("andrew@me.com");
        // we retrieve the value associated with the key
        System.out.println("The full name is: " + name);

        Set<String> keys = userMap.keySet();
        for (String key : keys) {
            // we iterate over the keys in the map using the keySet method.
            // This returns a Set of all the keys in the map.
            // We then loop over this set using a for-each loop, printing out each key
            // and its associated value using the get method.
            System.out.println("The Key is : " + key);
            System.out.println(userMap.get(key));
        }
    }
}
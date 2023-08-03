import java.util.HashMap;
import java.util.Set;

public class TrackList {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Chasing Pavements", "I made up my mind");
        trackList.put("Hello", "Hello, from the other side");
        trackList.put("Thinking About You", "Now everything I do is all for loving you");
        trackList.put("Im So Into", "I'm so into you");
        System.out.println(trackList.get("Chasing Pavements"));
        // we pull out song1 using the key
        Set<String> keys = trackList.keySet();
        // we use the keySet method to get all the keys
        for (String key : keys) {
            // we use the ket to get the value
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}
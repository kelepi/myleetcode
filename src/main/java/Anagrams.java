import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 2015/4/23
 * Time: 19:38
 */
public class Anagrams {
    public List<String> anagrams(String[] strs) {
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for (String str: strs) {
            String ord = ordered(str);
            if (map.containsKey(ord)) {
                map.get(ord).add(str);
            } else {
                ArrayList<String> list = new ArrayList<String>();
                list.add(str);
                map.put(ord, list);
            }
        }
        ArrayList<String> result = new ArrayList<String>();
        for (List<String> list: map.values()) {
            if (list.size() > 1) {
                result.addAll(list);
            }
        }
        return result;
    }

    public String ordered(String str) {
        int[] ints = new int[256];
        for (int i = 0; i != str.length(); i++) {
            char c = str.charAt(i);
            ints[(int)c]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i != ints.length; i++) {
            for (int j = 0; j != ints[i]; j++) {
                sb.append((char)(i));
            }
        }
        return sb.toString();
    }
}

package DSA.Recursion;
//
import java.util.*;

class Day28 {

    public static void generateIP(String s, int index, int parts, String current, List<String> result) {

        if (parts == 4 && index == s.length()) {
            result.add(current.substring(0, current.length() - 1));
            return;
        }

        if (parts > 4) return;

        for (int len = 1; len <= 3; len++) {

            if (index + len > s.length()) break;

            String part = s.substring(index, index + len);

            if (part.length() > 1 && part.charAt(0) == '0') continue;

            int number = Integer.parseInt(part);

            if (number > 255) continue;

            generateIP(s, index + len, parts + 1, current + part + ".", result);
        }
    }

    public static void main(String[] args) {

        String input = "25525511135";
        List<String> result = new ArrayList<>();

        generateIP(input, 0, 0, "", result);

        System.out.println(result);
    }
}
package BaiTapStack;

import java.util.HashMap;


public class BaiTapTreeMap {
    public static void main(String[] args) {
        String st = "yabcdabhaacaaa";
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i=0;i<st.length();i++){
            if (map1.containsKey(st.charAt(i))){
                map1.replace(st.charAt(i), map1.get(st.charAt(i))+1);
            } else {
                map1.put(st.charAt(i), 1);
            }
        }
        System.out.println(map1);
    }
}

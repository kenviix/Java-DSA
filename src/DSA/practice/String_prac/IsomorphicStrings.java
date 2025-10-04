// https://leetcode.com/problems/isomorphic-strings/description/

package DSA.practice.String_prac;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
//        String s = "egg", t = "add";
//        String s = "foo", t = "bar";
        String s = "badc", t = "baba";
        System.out.println(isIsomorphic(s,t));
    }

    private static boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i<s.length(); i++) {
            char charS=s.charAt(i);
            char charT=t.charAt(i);
            if (map.containsKey(charS)) {
                if (map.get(charS) != charT) return false;
            }
            else {
                if (map.containsValue(charT)) return false;
                map.put(charS, charT);
            }
        }
        return true;
    }


//    private static boolean isIsomorphic(String s, String t) {
//        if (s.length() != t.length()){
//            return false;
//        }
//
//
//        int[] map1 = new int[256];
//        int[] map2 = new int[256];
//
//        for(int i=0;i<s.length();i++){
//            char c1 = s.charAt(i);
//            char c2 = t.charAt(i);
//
//            if(map1[c1]==0 && map2[c2]==0){
//                map1[c1]=c2;
//                map2[c2]=c1;
//            }else{
//                if(map1[c1]!=c2 || map2[c2]!=c1){
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }
}

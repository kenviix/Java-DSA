package DSA.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumTimeDiff {
    public static void main(String[] args) {
        String[] times = {"23:59","00:00"};
        System.out.println(diff(times));;
    }
    static int diff(String[] times){
        int min = 1440;
        List<Integer> mins = new ArrayList<>();
        for(String time:times){
            char[] ch = time.toCharArray();
            int hours =  Math.abs((((int)ch[0] - '0') * 10 + (int)ch[1] - '0') * 60) ;
            int minutes = Math.abs(((int)ch[3] - '0') * 10 + (int)ch[4] - '0');
            mins.add(hours + minutes);
        }
        Collections.sort(mins);

        for (int i = 1; i < mins.size(); i++) {
            min = Math.min(min,mins.get(i) - mins.get(i-1));
        }

        min = Math.min(min,1440 - (mins.get(mins.size() -1) - mins.get(0)));
        return min;
    }
}

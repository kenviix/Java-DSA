// https://leetcode.com/problems/merge-intervals/description/

package DSA.practice.Arrays_prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingArray {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(arr)));
    }

    private static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if(ans.isEmpty()){
                ans.add(intervals[i]);
                continue;
            }else{
                int newMin = intervals[i][0];
                int newMax = intervals[i][1];
                int prevMin = ans.getLast()[0];
                int prevMax = ans.getLast()[1];

                if(newMin <= prevMax  ){
                    if(newMax > prevMax){
                        ans.getLast()[1] = newMax;
                    }
                    if(newMin < prevMin) {
                        ans.getLast()[0] = newMin;
                    }
                }else{
                    ans.add(intervals[i]);
                }

            }
        }
        return ans.toArray(new int[ans.size()][]);

    }
}

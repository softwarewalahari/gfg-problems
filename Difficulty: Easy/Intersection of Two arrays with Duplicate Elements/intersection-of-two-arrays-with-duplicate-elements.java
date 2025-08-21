import java.util.*;

class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        HashSet<Integer> setA = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();

        // add all elements of a into setA
        for (int num : a) {
            setA.add(num);
        }

        // now check elements of b
        HashSet<Integer> seen = new HashSet<>(); // to avoid duplicates in result
        for (int num : b) {
            if (setA.contains(num) && !seen.contains(num)) {
                res.add(num);
                seen.add(num);
            }
        }

        return res;
    }
}

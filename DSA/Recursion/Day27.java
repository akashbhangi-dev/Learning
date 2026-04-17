package DSA.Recursion;
import java.util.*;

class Day27 {

    static void solve(int[] nums, int target, int idx, 
                      List<Integer> curr, List<List<Integer>> res) {

    
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }


        if (idx == nums.length || target < 0) return;


        curr.add(nums[idx]);
        solve(nums, target - nums[idx], idx, curr, res);
        curr.remove(curr.size() - 1); // backtrack

        solve(nums, target, idx + 1, curr, res);
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> res = new ArrayList<>();

        solve(nums, target, 0, new ArrayList<>(), res);

        System.out.println(res);
    }
} 
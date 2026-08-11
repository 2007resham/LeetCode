class Solution {
    public int numIdenticalPairs(int[] nums) {

        int[] freq = new int[101];
        int pairs = 0;

        for (int num : nums) {
            pairs += freq[num];
            freq[num]++;
        }

        return pairs;
    }
}
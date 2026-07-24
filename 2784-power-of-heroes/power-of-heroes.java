class Solution {
    public int sumOfPower(int[] nums) {
        final long MOD = 1_000_000_007L;

        Arrays.sort(nums);

        long ans = 0;
        long prefix = 0;

        for (long x : nums) {
            long sq = (x * x) % MOD;

            ans = (ans + sq * ((x + prefix) % MOD)) % MOD;

            prefix = (2 * prefix + x) % MOD;
        }

        return (int) ans;
    }
}
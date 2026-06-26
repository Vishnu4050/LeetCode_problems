class Solution {

    class Fenwick {
        int[] bit;

        Fenwick(int n) {
            bit = new int[n + 2];
        }

        void update(int idx, int val) {
            while (idx < bit.length) {
                bit[idx] += val;
                idx += idx & -idx;
            }
        }

        int query(int idx) {
            int sum = 0;
            while (idx > 0) {
                sum += bit[idx];
                idx -= idx & -idx;
            }
            return sum;
        }
    }

    public long countMajoritySubarrays(int[] nums, int target) {   // <-- Rename here
        int n = nums.length;

        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (nums[i] == target ? 1 : -1);
        }

        long[] sorted = prefix.clone();
        Arrays.sort(sorted);

        Map<Long, Integer> map = new HashMap<>();
        int idx = 1;
        for (long x : sorted) {
            if (!map.containsKey(x)) {
                map.put(x, idx++);
            }
        }

        Fenwick bit = new Fenwick(idx + 2);

        long ans = 0;

        for (long p : prefix) {
            int rank = map.get(p);
            ans += bit.query(rank - 1);
            bit.update(rank, 1);
        }

        return ans;
    }
}
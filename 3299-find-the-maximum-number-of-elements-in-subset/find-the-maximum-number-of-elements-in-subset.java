class Solution {
    public int maximumLength(int[] nums) {
           Map<Long, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put((long) num, freq.getOrDefault((long) num, 0) + 1);
        }

        int result = 0;
        int onesCount = freq.getOrDefault(1L, 0);
        result = (onesCount % 2 == 0) ? onesCount - 1 : onesCount;

        for (long base : freq.keySet()) {
            if (base == 1) continue;

            int chainLength = 0;
            long current = base;

            while (freq.getOrDefault(current, 0) >= 2) {
                chainLength += 2;
                current = current * current;
                if (current > (long) 1e15) break;
            }

            
            if (freq.getOrDefault(current, 0) >= 1) {
                chainLength += 1;
            }
            if (chainLength % 2 == 0) chainLength -= 1;

            result = Math.max(result, chainLength);
        }

        return result;
    }
}
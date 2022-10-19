package Java_dz1;

class SecondTask {
        public int[] buildArray(int[] nums) {
            int[] ans = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                ans[i] = nums[nums[i]];
            }
            return ans;
        }
}

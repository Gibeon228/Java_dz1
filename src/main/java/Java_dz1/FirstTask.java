package Java_dz1;

class FirstTask {
        public int removeElement(int[] nums, int val) {
            int help = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[help] = nums [i];
                    help++;
                }
            }
            return help;
        }
}

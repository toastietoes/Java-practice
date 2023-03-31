public void RotateArray(int[] nums, int k) {
        k = k % nums.length;
        boolean[] boolArray = new boolean[nums.length];
        int n = 0;
        int temp = nums[0];
        int next;
        int nextIndex = 0;
        while(true){
            nextIndex = (n+k)%nums.length;
            if(boolArray[nextIndex]){
                if(nextUnchecked(boolArray) < 0) {
                    break;
                } else {
                    n = nextUnchecked(boolArray);
                    temp = nums[n];
                    continue;
                }
            }
            next = nums[nextIndex];
            nums[nextIndex]= temp;
            temp = next;
            boolArray[nextIndex] = true;
            n = nextIndex;
        }
        System.out.println(Arrays.toString(nums));
    }

    private int nextUnchecked(boolean[] boolArrays) {
        for (int i=0; i<boolArrays.length; i++){
            if(!boolArrays[i]) {
                return i;
            }
        }
        return -1;
    }

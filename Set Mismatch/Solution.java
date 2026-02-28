class Solution {
    public int[] findErrorNums(int[] nums) {
        int res[]=new int[2];
        int seen[]=new int[nums.length+1];
        for(int num : nums){
            if(seen[num]==1){
                res[0]=num;
            }
            seen[num]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(seen[i]==0){
                res[1]=i;
                break;
            }
        }
    return res;
    }
}
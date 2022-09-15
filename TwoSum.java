class Solution {
    public int[] twoSum(int[] nums, int target) {
        //method 1
    /*    int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;*/
        //method2
        HashMap<Integer,Integer> h=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(h.containsKey(comp)){
                arr[0]=h.get(comp);
                arr[1]=i;
                break;
            }else{
                h.put(nums[i],i);
            }
        }
        return arr;
        
    }
}
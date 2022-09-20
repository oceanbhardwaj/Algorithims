class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //method1
        int arr[]=new int[nums1.length+nums2.length];
        int i=0;
        for(;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            arr[i++]=nums2[j];
        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            return (double)(arr[arr.length/2]+arr[arr.length/2-1])/2;
        }
        return (double)arr[arr.length/2];
    }
}

---------------------------------------------------------------------------------------------------------------
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count=0;
        int len=nums1.length+nums2.length;
     
       //method2
       int n=(nums1.length+nums2.length)/2+1;
        int i=0;
        int j=0;
        int prev=0;
        int mid=0;
        int arr[]=new int[len];
        while(i<nums1.length || j<nums2.length){
            while(i<nums1.length && j<nums2.length){
                if(nums1[i]<nums2[j]){
                  
                    arr[count++]=nums1[i];
                    i++;
                }else{
                     
                    arr[count++]=nums2[j];
                    j++;
               
                }
              
             
            }
            while(i<nums1.length){
               
                    arr[count++]=nums1[i];
                i++;
            }
             while(j<nums2.length){
                 arr[count++]=nums2[j];
               j++;
                    
            }
            
        }
      
        if(len%2==0)
            return (double)(arr[len/2]+arr[len/2-1])/2;
        return (double)arr[len/2];
    }
}
------------------------------------------------------------------------------------------------------------------
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count=0;
        int len=nums1.length+nums2.length;
     
       //method3
       int n=(nums1.length+nums2.length)/2+1;
        int i=0;
        int j=0;
        int secmid=0;
        int mid=0;
       // int arr[]=new int[len];
        while(i<nums1.length || j<nums2.length){
            while(i<nums1.length && j<nums2.length){
                if(nums1[i]<nums2[j]){
                  
                    //arr[count++]=nums1[i];
                    count++;
                    if(count==n-1)
                        secmid=nums1[i];
                    if(count==n)
                        mid=nums1[i];
                        
                    i++;
                }else{
                     
                    //arr[count++]=nums2[j];
                    count++;
                     if(count==n-1)
                        secmid=nums2[j];
                    if(count==n)
                        mid=nums2[j];
                    j++;
               
                }
              
             
            }
            while(i<nums1.length){
               
                   // arr[count++]=nums1[i];
                count++;
                 if(count==n-1)
                        secmid=nums1[i];
                    if(count==n)
                        mid=nums1[i];
                i++;
            }
             while(j<nums2.length){
                 //arr[count++]=nums2[j];
                 count++;
                  if(count==n-1)
                        secmid=nums2[j];
                    if(count==n)
                        mid=nums2[j];
               j++;
                    
            }
            
        }
      
        if(len%2==0)
            return (double)(secmid+mid)/2;
        return (double)mid;
    }
}
------------------------------------------------------------------------------------------------------
o(log(Math.min(n,m))     o(1)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //method4
       if(nums2.length<nums1.length)
           return findMedianSortedArrays(nums2,nums1);
        int low=0;
        int high=nums1.length;
        int n1=nums1.length;
        int n2=nums2.length;
        while(low<=high){
            int mid=(low+high)>>1;
            int l1=(mid==0)?Integer.MIN_VALUE:nums1[mid-1];
            int l2=(mid==n1)?Integer.MAX_VALUE:nums1[mid];
            int cut2=(n1+n2+1)/2-mid;
            int r1=(cut2==0)?Integer.MIN_VALUE:nums2[cut2-1];
            int r2=(cut2==n2)?Integer.MAX_VALUE:nums2[cut2];
            
            if(l1<=r2 && r1<=l2){
                if((n1+n2)%2==0)
                    return (double)(Math.max(l1,r1)+Math.min(l2,r2))/2.0;
                return (double)(Math.max(l1,r1));
            }else if(l1>r2){
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return 0.0;
    }
}
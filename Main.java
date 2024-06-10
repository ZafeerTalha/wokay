public class Main{
    public static void trappedwater(int height[]){
        int n=height.length
       //calculate left max boundary
       int left_max[]=new int[n];
       left_max[0]=height[0];
       for(int i=1;i<n;i++){
           left_max[i]=Math.max(height[i],left_max[i-1]);
       }
       //calculate right max boundary
       int right_max[]=new int[n];
       right_max[n-1]=height[n-1];
       for(int i=n-2;i>=0;i--){
           right_max[i]=Math.max(height[i],right_max[i+1]);
       }
       //loop
       int trappedwater=0;
       int waterlevel;
       for(int i=0;i<n;i++){
           waterlevel=Math.min(left_max[i],right_max[i]);
           trappedwater+=waterlevel-height[i];
       }
       //waterlevel=min(left max,right max)
       //trapped rainwater = waterlevel-height[i]       
    
      System.out.println(trappedwater);
    }
      public static void main(String args[]){
          int height[]={4,2,0,6,3,2,5};
          trappedwater(numbers);

     }
}
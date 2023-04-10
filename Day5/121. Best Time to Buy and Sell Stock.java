class Solution {
    public int maxProfit(int[] price) {
        int maxi=Integer.MAX_VALUE;
        int overallprof=0;
        int p=0;
        int n=price.length;
        for(int i=0;i<n;i++){
            if(price[i]<maxi){
                maxi=price[i];
            }
            p=price[i]-maxi;
            if(overallprof<p){
                overallprof=p;
            }
        }
return overallprof;
    }
}

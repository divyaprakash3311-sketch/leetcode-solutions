class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         List<Boolean> a= new ArrayList<>();
         int max=candies[0];
        for(int i=0;i<candies.length;i++){
            int maxi=Math.max(candies[i],max);
                if(max<maxi){
                    max=maxi;
                }
        }
            for(int i=0;i<candies.length;i++){
                if(candies[i]+extraCandies>=max){
                    a.add(true);
                }
                else{
                    a.add(false);
                }
            }

           
        
        return a;
    }
}
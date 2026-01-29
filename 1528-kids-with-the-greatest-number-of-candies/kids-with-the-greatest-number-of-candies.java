class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

    List<Boolean> result=new ArrayList<>();
        //max to compare each 
    int max = candies[0];
    for (int c : candies) {
    max = Math.max(max, c);
}
    //adding extraCandies 
    for(int i=0;i<candies.length;i++){
        if(candies[i]+extraCandies >= max){
            result.add(true);
        }else{
            result.add(false);
        }
        //compare
    }
    return result;
    }
}
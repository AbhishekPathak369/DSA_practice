class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int rS =0;
        int cS= 0;
        int rE = mat.length-1;
          int cE= mat[0].length-1;
               List<Integer> ans = new ArrayList<>();


        while(rS <= rE && cS <= cE){
            // left to right
            for(int i =cS; i<= cE;i++){
ans.add(mat[rS][i]);
            }
            rS++;
            // up to down
            for(int i = rS; i<= rE; i++){
                ans.add(mat[i][cE]);
            }
            cE--;
if( rS <= rE){
            for(int i =cE; i>=cS; i--){
                ans.add(mat[rE][i]);
            }}
            rE--;
if(cS <= cE){
            for(int i =rE; i>= rS; i--){
                ans.add(mat[i][cS]);
            }}
            cS++;
        }
        return ans;
    }
}
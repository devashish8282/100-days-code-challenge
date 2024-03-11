class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        int count=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                set.add(x-mat1[i][j]);
            }
        }
        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[0].length;j++){
               if(set.contains(mat2[i][j])){
                   count++;
               }
            }
        }
        return count;
    }
}

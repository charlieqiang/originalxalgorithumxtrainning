public class Solution {
    /**
     * @param A: An integer array
     * @param B: An integer array
     * @return: Their smallest difference.
     */
    public int smallestDifference(int[] A, int[] B) {
        int res = Integer.MAX_VALUE;
        int temp = 0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                temp = (A[i]-B[j]) > 0 ?  A[i]-B[j] : B[j]-A[i];
                if(res > temp){
                    res = temp;
                }
            }
        }
        return res;
    }
}

public class Solution {
    /**
     * @param A: An integer array
     * @param B: An integer array
     * @return: Their smallest difference.
     */
    public int smallestDifference(int[] A, int[] B) {
        // write your code here
        Arrays.sort(A);
        Arrays.sort(B);

        int idx1=0;
        int idx2=0;
        int min = Integer.MAX_VALUE;
        while(idx1<A.length && idx2<B.length){
            min = Math.min(min,Math.abs(A[idx1]-B[idx2]));
            if(A[idx1]<B[idx2]){
                idx1++;
            }else if(A[idx1]>B[idx2]){
                idx2++;
            }else{
                break;
            }
        }
        return min;
    }
}
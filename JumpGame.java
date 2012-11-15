public class Solution {
    public boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int marker = A.length - 1;
        for(int i = A.length - 2; i >= 0; --i)
            if(marker - i <= A[i])    
                marker = i;
        if(marker == 0) return true;
        else    return false;
    }
}
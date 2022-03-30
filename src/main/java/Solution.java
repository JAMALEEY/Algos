class Solution {

    //{2,3,1,1,4}
    public boolean canJump(int[] nums) {
        int numsLength = nums.length;
        if( numsLength == 0){
            return  false;
        }
        int myPosition = 0;
        int toJump = nums[myPosition];
        if((myPosition+toJump) >= numsLength){
            return true;
        }
        while (toJump >= 0 && (myPosition+toJump) < numsLength ){
            myPosition = myPosition+toJump;
            toJump = nums[myPosition];
            if(toJump == 0 && myPosition < numsLength - 1){
                return false;
            } else if( myPosition >= numsLength - 1 ){ // ( toJump == 0 && myPosition == numsLength - 1 )
                return true;
            }
        }

//        for (int i = 0; nums[i] < numsLength - 1 ; i++) {
//             //2
//            if ( myPosition < numsLength && myPosition != 0 ){
//                myPosition = nums[i+myPosition];
//                System.out.println("test");
//            } else {
//                System.out.println("khrjt");
//            }
//        }
        return false;
    }
}
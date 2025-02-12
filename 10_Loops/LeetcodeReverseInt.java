class LeetcodeReverseInt   {
    public static void main(String[] args) {
        int num = 12345
        boolean flag= false;
        if(num<0){
            flag = true; //if the num is -ve
            num= Math.abs(num);
        }
        long rev = 0;
        for(int i=num;i>0;i/=10){
            rev =rev*10+(i%10);
        }
        if(flag){
            rev = rev*(-1);
        }
        if(rev>Integer.MAX_VALUE ||rev<Integer.MIN_VALUE ){
            return 0;
        }
        else{
            return (int)rev;
        }
    }
}
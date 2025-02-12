public class Test8 {
    public static void main(String[] args) {
        int num[]={2,5,8};
        int max=num[0];
        for(int nums:num){
            if(nums>max){
                max=nums;
            }
           
        }
        System.out.println(max);

    }    
}

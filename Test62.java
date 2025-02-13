public class Test62 {
    public static void main(String[] args) {
        int a=153;
        String b=Integer.toString(a);
        int lenghth=b.length();
        int sum=0;
        for(int i=0;i<lenghth;i++){
           int j= Character.getNumericValue(b.charAt(i));
           sum+=Math.pow(j, lenghth);
           
        }
        System.out.println(sum);
        if(a==sum){
            System.out.println(a+"  is armstrong number");
        }else{
            System.out.println("it is not armstrongnumber");
        }

    }
    
}

public class Test11 {
    public static void main(String[] args) {
        int a=7;
        int b=2;
        int c=6;
         if(a>b&& a>c && b>c){
            System.out.println(a+"," +b+","+c);
        }else if(b>c && b>a && a>c){
            System.out.println(b+"," +a+","+c);
        }else if(a>c && a>b && c>b ){
            System.out.println(a+"," +c+","+b);
        }else if(b>a && b>c && c>a){
            System.out.println(b+"," +c+","+a);
        }else if(c>a && c>a && a>b){
            System.out.println(c+"," +a+","+b);
        }else {
            System.out.println(c+"," +b+","+a);
        }


    }    
}

public class Test15 {

    public static void main(String[] args) {
        int count=0;
        int i=1;
      while(i>0){
        if(i%2==0 && i%3==0 && i%5==0){
            count++;
            System.out.println(i);
        }
        if(count>=5){
            break;
        }
          i++;
      
        }
       
    }
}
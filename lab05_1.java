public class lab05_1 {
    public static void main(String[] args) {

        double sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0) {
                System.out.println(i);
                sum += i;
            } 
        }
        System.out.println("Sum: "+sum);
    }
}

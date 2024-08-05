public class Spy {
    public static void main(String[] args){
        int n=98;int p=1;int sum=0;
        while(n!=0){
            int digit = n%10;
            p=p*digit;
            sum=sum+digit;
            n=n/10;
        }
        if(sum==p){
            System.out.println("Spy number");
        }

    }
    
}

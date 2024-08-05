public class strong {
    public static void main(String[] args){
        int n=145,digit,sum=0,temp=n;
        while(n!=0){
            int fact=1;
digit = n%10;               //to get last digit 
for(int i=1;i<=digit;i++){
    fact=fact*i;
}
sum=sum+fact;
n=n/10;                   //to remove last digit

        }
        if(sum==temp){
            System.out.println("Strong Number");

        }
        else {
            System.out.println("Not a Strong Number");
        }

        
    }
    
}

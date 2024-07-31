public class Leap {
    public static void main(String[] args){
        int year=2024;
        if(year%100!=0){
            if(year%400==0 && year%4==0){
                System.out.println("The year is leap year");
            }
            
        }
        else{
            System.out.println("Not a leap year");
        }
    }
    
}

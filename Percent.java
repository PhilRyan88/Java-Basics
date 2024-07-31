public class Percent {
    public static void main(String[] args){
        int c=95,p=90,m=80;
        float perc = (c+p+m)/300F *100;
        if(perc<90 && perc>80){
            System.out.println("First Grade");
        }
        else if(perc<80 && perc>70){
            System.out.println("Second Class");

        }
        else if(perc<70 && perc>60){
            System.out.println("Third Grade");
        }
        else{
            System.out.println("Failed");
        }
    }
    
}

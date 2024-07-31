public class Mark {
    public static void main(String[] args){
        int p =77;
        int c= 78;
        int m=98; int o =77;
        int total = p+c+m+o;
        float per = total/400F *100;
        if(p>=35 && c>=35 && m>=35 && o>=77){
            if(per<60 && per>=35){
                System.out.println("Second Class");

            }
            if(per<80 && per>=60){
                System.out.println("First Class");
            }
            if(per>80){
                System.out.println("Distinction");
            }
        }
    }
}

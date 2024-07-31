public class id {

    public static void main(String[] args){
        String id="PAN";
        if(id.equals("Adhaar")){
            System.out.println("Adhar Verified");
        }
        else if(id.equals("PAN")){
            System.out.println("Pan Verified");
        }
        else if(id.equals("DL")){
            System.out.println("Driving License Verified");

        }
        else{
            System.out.println("No id cards");
        }
    }
}
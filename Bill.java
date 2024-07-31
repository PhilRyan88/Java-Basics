public class Bill {
    public static void main(String[] args){
        int total = 135*5;
        float gst = total * 18/100F;
        float grand_total= total + gst;
        System.out.println("total ="+total);
        System.out.println("GST = "+gst);
        System.out.println("Grand Total = "+grand_total);
    }
    
}

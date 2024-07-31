public class Pbill {
    public static void main(String[] args){
        int p1 =799;
        int p2=1299;
        int p3=299;
        int p4=599;
        int total = p1+p2+p3+p4;
        float discount= total*25/100F;
        float grand_total= total - discount;
        System.out.println("Total = "+total);
        System.out.println("Discount = "+discount);
        System.out.println("Grand Total = "+grand_total);
    }
}

public class Character{
    public static void main(String[] args){
        char ch='A';
        if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')){
            System.out.println("It is an alphabet");
        }
        else if(ch>='0'&&ch<='9'){
            System.out.println("It is a Numerical character");
        }
        else{
            System.out.println("It is a special character");
        }
    }
}
public class Vowel {
    public static void main(String[] args){
        char ch='1';
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){

        
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            System.out.println("The character is Vowel");

        }
        else{
            System.out.println("The character is Consonant");
        }
    }
    else{
        System.out.println("Enter an alphabet");
    }
    }
    
}

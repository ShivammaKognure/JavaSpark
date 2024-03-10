package String;

public class CombineString {
    public static void main(String[] args) {
        //example of == and equals()
        //== compare reference and equals compare contet
        String str="Shivani";
        String str1=new String("Shivani");
        if(str == str1)
            System.out.println("both are same");
        else
            System.out.println("not Same");

        //combine 2 string
        String s1="Abc";
        String s2="Xyz";
        String s3=s1+s2;
        System.out.println(s3);

        //reverse string
        for(int i=s3.length()-1;i>=0;i--){
            System.out.print(s3.charAt(i));
        }

    }
}

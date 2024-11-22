import java.util.Scanner;
public class IT24104133_Lab5_Q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            int num1, num2, num3,Value;

            System.out.println("Enter your first number");
            num1=input.nextInt();

            System.out.println("Enter your secound number");
            num2=input.nextInt();

            System.out.println("Enter your third number");
            num3=input.nextInt();

            if (num1>num2 && num1>num3){
                System.out.println(num1+" is lagest");
            }
                else if(num2>num1 && num2>num3){
                   System.out.println(num2+"is lagest");
                }else{
                        System.out.println(num3+ "is lagest");
                }
            if (num1<num2 && num1<num3){
                System.out.println(num1+" is Smallest");
            }
                else if(num2<num1 && num2<num3){
                   System.out.println(num2+"is Smallest");
                }else{
                        System.out.println(num3+ "is Smallest");
                }
    
    }
}
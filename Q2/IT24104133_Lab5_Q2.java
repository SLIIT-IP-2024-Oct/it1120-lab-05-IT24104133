import java.util.Scanner;
public class IT24104133_Lab5_Q2{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int mem;
        

        System.out.println("Enter number of members");
        mem=input.nextInt();

        switch(mem){
            case 0:
                System.out.println("No Prize");
            break;

            case 1:
                System.out.println("Pen");
            break;

            case 2:
                System.out.println("umbrella");
            break;

            case 3:
                System.out.println("Bag");
            break;

            case 4:
                System.out.println("Travelling chair");
            break;

        default:
            if(mem>=5){
                System.out.println("Headphone");
           } else{
            System.out.println("input must be 0 or greaterthan");
           }

            
        }
    }
}
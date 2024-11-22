import java.util.Scanner;
public class IT24104133_Lab5_Q3{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        final double Room_charges_per_day=48000;
        final double Discount_3_To_4_Days=10;
        final double Discount_5_or_more_days=20;
        double value;
        int st_date, en_date, da_re;
        
        System.out.println("Enter start date");
        st_date=input.nextInt();
        if(st_date > 31 || st_date < 1){
            System.out.println("Error: Start date must between 1 to 31");
        return;
        }

        System.out.println("Enter ending date");
        en_date=input.nextInt();
        if (en_date > 31 || en_date < 1){
            System.out.println("Error: End date must between 1 to 31");
        return;
        }

        if (st_date > en_date){
            System.out.println("Error: Start date must be less than the end date.");
        return;
        }

        da_re = en_date - st_date ;

        System.out.println("Room charge per Day: Rs."+Room_charges_per_day+"/=");
        System.out.println("No of days reserved : "+da_re);

        value = (da_re <3) ? (da_re*Room_charges_per_day) :
                (da_re < 5) ? (da_re*Room_charges_per_day) - (da_re*Room_charges_per_day*Discount_3_To_4_Days/100) :
                (da_re*Room_charges_per_day) - (da_re*Room_charges_per_day*Discount_5_or_more_days/100);
        System.out.println("Total Amount to be paid : "+value);
        

    }
}
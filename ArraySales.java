//WAP to accepts sales of each day of week and print the Total Sales and
//Average Sales of the week by accepting input at the Terminal Window.
import java.util.*;
public class ArraySales
{
    double sales[] = new double[7];
    String day[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    // I wrote the above line for my own practice to print the name of day while
    // asking the sales for that particular day
    Scanner scan=new Scanner(System.in);
    
    public void accept()
    {
        double sum = 0;
        for(int i=0;i<7;i++)
        {
            System.out.println("Enter the Sales of "+day[i]);
            sales[i] = scan.nextDouble();
            sum = sum+sales[i];
        }
        double average = sum/7;
        System.out.println("Total Sales is "+sum);
        System.out.println("Average Sales is "+average);
    }
}
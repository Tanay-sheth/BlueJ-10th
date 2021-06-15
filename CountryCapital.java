/** Write an Array program to create an array of
 * three countries and their capitals
 * accept the values
 * and print them in tabular format
 */ 
import java.util.*;
public class CountryCapital
{
    String country[] = new String[3];
    String capital[] = new String[3];
    Scanner scan=new Scanner(System.in);
    
    public void accept()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the name of the country");
            country[i] = scan.next();
            
            System.out.println("Enter the name of the capital");
            capital[i] = scan.next();
        }
        
        
        System.out.println("Country"+"\t"+"Capital");
        for(int i=0;i<3;i++)
        {
            System.out.println(country[i]+"\t"+capital[i]);
        }
    }
}
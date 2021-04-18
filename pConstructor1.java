import java.util.*;
public class pConstructor1
{
    public String mobileName;
    public String mobileDate;
    public String mobileDetails;
    public double mobileCost;
    
    public pConstructor1()
    {
        mobileName = "Smart Phone";
        mobileDate = "Not specified";
        mobileDetails = "No details available";
        mobileCost = 0.0;
    }
    
    public void acceptNewMobile()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please give the Mobile Name");
        mobileName = scan.next();
        
        System.out.println("Please give the Mobile Date of release (in dd/mm/yy format)");
        mobileDate = scan.next();
        
        System.out.println("Please give the Mobile Details");
        mobileDetails = scan.next();
        
        System.out.println("Please give the Mobile Cost");
        mobileCost = scan.nextDouble();
    }
    
    public void display()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Mobile  :"+mobileName);
        System.out.println("Date    :"+mobileDate);
        System.out.println("Details :"+mobileDetails);
        System.out.println("Cost    :"+mobileCost);
    }
    
    public static void main()
    {
        pConstructor1 mobile = new pConstructor1();
        mobile.acceptNewMobile();
        mobile.display();
    }
}
    
    
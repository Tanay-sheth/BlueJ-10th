import java.util.*;
public class BookFair
{
    private double price;
    private String bname;
    double discount;
    Scanner scan = new Scanner(System.in);
    
    public BookFair()
    {
       bname = "";
       price = 0.0;
    }
    
    public void input()
    {
        System.out.println("Enter the name of the book");
        bname = scan.next();
        
        System.out.println("Enter the price of the book");
        price = scan.nextDouble();
    }
    public void calculate()
    {
        if(price<=1000)
        {discount=2;}
        
        else if(price>1000 && price<=3000)
        {discount=10;}
        
        else
        {discount=15;}
    }
    
    public void display()
    {
        System.out.println("Name of the book is  "+ bname);
        price = price - ((discount/100)*price);
        System.out.println("Price of the book is  "+ price);
    }
    
    public static void main()
    {
        BookFair obj = new BookFair();
        obj.input();
        obj.calculate();
        obj.display();
    }
}

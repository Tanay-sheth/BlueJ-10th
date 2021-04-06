
/**Define a class named FruitJuice with the following description
Instance variables/data members
int product_code - stores the product code number
String flavour - stores the flavour of the juice (E.g. orange, apple)
String pack_type - stores the type of packaging (E.g. tetra pack, PET bottle)
int pack_size - stores package size (E.g. 200 ml, 400 ml etc)
int product_price - stores the price of the product
Member methods:
i. FruitJuice() - Default constructor to initialize integer data members to 0

and String data members to “”.

ii. void input() - To input and store the product code, flavour, pack type,

pack_size and product price.
iii. void discount() To reduce the product price by 10.
iv. void display() To display the product code, flavour, pack type, pack size

and product price.
 */
import java.util.*;
public class FruitJuice
{
    Scanner scan=new Scanner(System.in);
    private int product_code, pack_size, product_price;
    private String flavour, pack_type;
    public FruitJuice() //default 
    {
        product_code=0;
        pack_size=0;
        product_price=0;
        flavour="";
        pack_type="";
    }
    public void input()
    {
        System.out.println("Enter the Product code");
        product_code=scan.nextInt();
        
        System.out.println("Enter the flavour");
        flavour=scan.next();
        
        System.out.println("Enter the Pack type");
        pack_type=scan.next();
        
        System.out.println("Enter the Pack size");
        pack_size=scan.nextInt();
        
        System.out.println("Enter the product prize");
        product_price=scan.nextInt();
    }
    public void discount()
    {
        product_price-=10; //product_price = product_price-10
    }
    public void display()
    {
        System.out.println("Product code "+product_code);
        System.out.println("Flavour "+flavour);
        System.out.println("Pack type "+pack_type);
        System.out.println("Pack size "+pack_size);
        System.out.println("Product Price "+product_price);
    }
}
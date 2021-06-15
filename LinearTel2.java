import java.util.*;
public class LinearTel2
{
    Scanner scan=new Scanner(System.in);
    public void accept()
    {
        String name[]=new String[3]; 
        long tel[]=new long[3]; 
        for(int i=0;i<name.length;i++) 
        {
            System.out.println("Enter name of Person ");
            name[i]=scan.next();
            System.out.println("Enter Telephone ");
            tel[i]=scan.nextLong();
        }
        System.out.println("Enter name of person to be searched ");
        String n=scan.next(); 
        int flag=0;
        for(int i=0;i<3;i++)
        {
            if(name[i].equalsIgnoreCase(n))
            {
                System.out.println("Search Succesful \n");
                System.out.println("Name " +" Telephone ");
                System.out.println(n + "\t" + tel[i]);
                flag=1;
            }
        }
        if(flag==0)
            System.out.println("Search unsuccessful.No name in the list");
    }
}
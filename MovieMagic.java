/** link: https://classroom.google.com/c/Mjg0MzgxOTg3OTI0/a/MzEyODkyNjI3NzE4/details
 * 
 * Q.2. Define a class named MovieMagic with the following description:
Instance variables/data members
int year - to store the year of release of a movie
String title - to store the title of the movie
float rating - to store the popularity rating of the moview
(minimum rating =0.0 and max. rating =5.0)

Member methods:
i. movieMagic() - Default constructor to initialize numeric data members to 0

and String data member to “”.

ii. void accept() - To input and store year, title and rating.
iii. void display() - To display the title of a movie and a message based on the

rating as per table below.
Rating Message to be displayed
0.0 to 2.0 Flop
2.1 to 3.4 Semi-hit
3.5 to 4.5 Hit
4.6 to 5.0 Super Hit

Write a main method to create an object of the class and call the above member methods. 
 */

import java.util.*;
public class MovieMagic
{
    Scanner scan = new Scanner(System.in);
    private int year;
    private String title;
    private float rating;
    
    public MovieMagic()
    {
        year=0;
        title="";
        rating=0.0f;
    }
    
    public void accept()
    {
        System.out.println("Enter the year of the movie");
        year=scan.nextInt();
        System.out.println("Enter the title of the movie");
        title=scan.next();
        System.out.println("Enter Rating");
        rating=scan.nextFloat();
    }
    
    public void display()
    {
        System.out.println("Title of the movie"+title);
        if(rating>=0.0 && rating<=2.0)
        System.out.println("Flop");
        else if(rating>=2.1 && rating<=3.4)
        System.out.println("Semi-hit");
        else if(rating>=3.5 && rating<=4.5)
        System.out.println("Hit");
        else if(rating>=4.6 && rating<=5.0)
        System.out.println("Super Hit");
    }
    
    public static void main() 
    {
        MovieMagic obj=new MovieMagic();
        obj.accept();
        obj.display();
    }
}
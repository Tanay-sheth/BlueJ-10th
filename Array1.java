//Prog 1: WAP to initialize an Array Marks and print all the elements of the Array.
public class Array1
{   
    public void display()
    {
        int marks[]={45,55,65,45,55}; // create and initialize array
        for(int i=0;i<5;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
//Tip - You could write i<=4 or i<name.length in the for loop. Try i<=3 in for loop and
//see output. name.length returns the size of the array
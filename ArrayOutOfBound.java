/** Write a Class that creates and initializes an array marks and will raise an out of bound
* exception when the program tries to access an array elements through an illegal
* subscript
*/
public class ArrayOutOfBound
{
    public void display()
    {
        int marks[]={45,55,65,75,85}; // create & initialize array
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("marks[ "+ i +"]=" + marks[i]);
        }
    }
}
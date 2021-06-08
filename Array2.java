/* Write an Array to read the marks of 5 students. Print the total and average marks of the
* student. To pass an array as arguments, enclose its elements in curly braces({}) e.g.
*{40,40,40,40,40}
*/
public class Array2
{
    public void display(int marks[])
    {
        int sum=0;
        for(int i=0;i<marks.length;i++)
        {
            sum=sum+marks[i];
        }
    System.out.println("Sum = "+sum);
    System.out.println("Average = "+sum/marks.length);
    }
}
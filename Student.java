public class Student
{
    //declare instance variable
    private String name;
    private double perc;
    
    //parameterized constructor
    public Student()
    {
        name="Kartik";
        perc=85.5;
    }
    
    //non parameterized constructor
    public Student(String n,double p)
    {
        name = n;
        perc = p;
    }
    
    public void display()
    {
        System.out.println("Name       "+name);
        System.out.println("Percentage "+perc);
    }
}
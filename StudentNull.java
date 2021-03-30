//Write a class StudentNull with the following 
//i. Constructor to initialize variables to null values 
//ii. Parameterized constructor to accepts values 
//iii. Method display() to display the values. 
public class StudentNull
{
private String name;
private double perc;
public StudentNull()
{
name="";
perc=0.0;
}
public StudentNull(String n,double p)
{
name=n;
perc=p;
}
public void d()
{
System.out.println(name+"\t"+perc);
}
}
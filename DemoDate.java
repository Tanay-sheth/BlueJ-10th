public class DemoDate
{
public void display()
{
// access variables
Date today=new Date();
today.d=30;
today.display(); // 30/01/2007
// access functions
Date indepDay=new Date(15,8,2007);
indepDay.display(); // 15/08/2007
// Temporary Objects
new Date().display(); // same as today.display
new Date(15,8,2010).display(); // same as indepDay.display
}
}
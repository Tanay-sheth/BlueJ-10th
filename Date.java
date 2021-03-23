public class Date
{
    //declare instance variable
    private int d,m,y;
    
    //parameterized constructor
    public Date()
    {
        d=23;
        m=3;
        y=2021;
    }
    
    //non parameterized constructor
    public Date(int dd,int mm,int yy)
    {
        d=dd;
        m=mm;
        y=yy;
    }
    
    public void display()
    {
        System.out.println(d+"/"+m+"/"+y);
    }
}
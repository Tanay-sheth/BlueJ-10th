public class URL
{
    private String protocol,hostname,type;
    
    public URL()
    {
        protocol="www";
        hostname="google";
        type="com";
    }
    
    public URL(String p,String h,String t)
    {
        protocol=p;
        hostname=h;
        type=t;
    }
    
    public void display()
    {
        System.out.println("URL is "+protocol+"."+hostname+"."+type);
    }
}
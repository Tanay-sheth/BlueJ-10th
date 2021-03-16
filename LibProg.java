public class LibProg
{
    public void accept(String str)
    {
        System.out.println(str);
        System.out.println(str.toUpperCase());
    }
    
    public void twostringsmerge(String s1,String s2)
    {
        System.out.println(s1.concat(s2));
    }
    
    public void strreplace(String str, char a, char b)
    {
        System.out.println(str.replace(a,b));
    }
    
    public void charposition(String str)
    {
        System.out.println(str.charAt(4));
    }
    
    public void charposition2(String str)
    {
        System.out.println(str.charAt(0));
        System.out.println(str.length()-1);
    }
    
    public void strings(String str)
    {
        System.out.println(str.indexOf(' '));
        System.out.println(str.lastIndexOf(32));
    }
    
    public void strreplace(String str)
    {
        System.out.println(str);
    }
}
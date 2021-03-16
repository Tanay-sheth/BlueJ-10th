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
    
    public void strreplace(String str) //"HVB IS THE BEST SCHOOL IN MUMBAI"
    {
        System.out.println(str.substring(0,3)+" "+str.substring(11,15)+" "+str.substring(26));
    }
    
    public void LibForIf(String str)
    {
        str = str.toUpperCase();
        int ctr=0; //tokeep track of vowels
        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                ctr += 1;
            }
        }
        System.out.println(str);
        System.out.println("Number of vowels is "+ctr);
    }
}
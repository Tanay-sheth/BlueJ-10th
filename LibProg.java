public class LibProg
{
    public void accept(String str) //to print in upper case
    {
        System.out.println(str);
        System.out.println(str.toUpperCase());
    }
    
    public void twostringsmerge(String s1,String s2) //accept two strings and merge them
    {
        System.out.println(s1.concat(s2));
    }
    
    public void strreplace(String str, char a, char b)//accept a string, replace letterin it 
    {
        System.out.println(str.replace(a,b));
    }
    
    public void charposition(String str)//print letter at a certain position
    {
        System.out.println(str.charAt(4));
    }
    
    public void charposition2(String str)//print first andast letter of a string
    {
        System.out.println(str.charAt(0));
        System.out.println(str.length()-1);
    }
    
    public void strings(String str)//rint the position of the first and lst SPACE in the string
    {
        System.out.println(str.indexOf(' '));
        System.out.println(str.lastIndexOf(32));
    }
    
    public void strreplace(String str) //"HVB IS THE BEST SCHOOL IN MUMBAI" //to print certain substrings in an accepted string
    {
        System.out.println(str.substring(0,3)+" "+str.substring(11,15)+" "+str.substring(26));
    }
    
    public void LibForIf(String str)//Important Library,if,for program. To find the number of vowels in the string 
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

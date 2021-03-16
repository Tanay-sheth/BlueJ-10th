public class LibForIf
{
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
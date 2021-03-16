public class LibForIf//Important Library,if,for program. To find the number of vowels in the string 
{
public void LibForIf(String str)
    {
        str = str.toUpperCase();
        int ctr=0; //to keep track of vowels
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

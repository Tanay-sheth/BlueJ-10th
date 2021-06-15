/**ICSE 2005 SEC.B. Q.9. 
WAP to initialize an array of 3 names and initialize another array
with their  respective telephone numbers. Search for a name input
by the User, in the  list. If found, display "Search successful" and
print the name along with the  telephone number, otherwise display
"Search unsuccesful. Name not  enlisted".
*/
public class LinearTel 
{ 
    public void accept(String n) 
    { 
     String name[]={"Lal","Bal","Pal"}; 
     long tel[]={22816980,22816982,22816983}; 
  
     int flag=-1; 
  
     for(int i=0;i<name.length;i++) 
     { 
         if(name[i].equalsIgnoreCase(n)) 
         { 
             System.out.println("Search Sucessful "); 
             System.out.println(n+"\t"+tel[i]); 
             flag=1; 
            } 
    } 
    if(flag==-1) 
        System.out.println("Search unsucessful Name not found ");
    } 
}

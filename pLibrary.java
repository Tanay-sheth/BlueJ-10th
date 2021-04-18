public class pLibrary
{
    public void display()
    {
        String words = "Hello Brother";
        String xyz = " Lol ";
        System.out.println(words.toUpperCase());
        System.out.println(words.toLowerCase());
        System.out.println(words.indexOf('o'));
        System.out.println(words.lastIndexOf('o'));
        System.out.println(words.concat("my name is Tanay"));
        System.out.println(words.concat(" my name is Tanay"));
        System.out.println(words.charAt(0));
        System.out.println(words.charAt(6));
        System.out.println(words.substring(6,13));
        System.out.println(words.substring(4));
        System.out.println(words.substring(0,5));
        System.out.println(words.length());
        System.out.println(words.replace('o','u'));
        System.out.println(xyz.trim());
        System.out.println(words.startsWith("Hell"));
        System.out.println(words.endsWith("her"));
        System.out.println(words.endsWith("Hello man"));
        System.out.println(words.equals("Hellooo"));
        System.out.println(words.equalsIgnoreCase("hello brother"));
        System.out.println(words.equalsIgnoreCase("heLLo wold"));
        System.out.println(words.compareTo(xyz));
        System.out.println(words.compareTo("Hello Brother"));
        System.out.println(words.compareTo("Hello Brotherr"));
        System.out.println(words.compareTo("Hello Brothe"));
        System.out.println(words.compareTo("Hello BrotHER"));
        System.out.println(words.compareTo("HELLO BROTHER"));
    }
    
    public static void main()
    {
        pLibrary object = new pLibrary();
        object.display();
    }
}

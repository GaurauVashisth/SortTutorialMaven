package packt.java11.example;
import packt.java11.example.stringsort.Sort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String[] names = new String[]{"Sam","Elon","Mark","Mira","Hassan"};
        Sort.sort(names);
    }
}

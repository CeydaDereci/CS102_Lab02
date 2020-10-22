import cs1.SimpleURLReader;
/**
 *
 * @author Ceyda Dereci
 * @since 22.10.2020
 */
public class Test {
    public static void main(String[] args){

        //part a
        cs1.SimpleURLReader a = new SimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt");
        
        System.out.println("------------------------");
        System.out.println("Part a");
        System.out.println("Line count: " + a.getLineCount() + "\n");
        //System.out.println("Contents: " + a.getPageContents());
        
        
        //part b
        System.out.println("------------------------");
        System.out.println("Part b");
        MySimpleURLReader b = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
        System.out.println("URL: " + b.getURL());
        System.out.println("Name: " + b.getName());
        
        
        System.out.println("------------------------");
        System.out.println("Part c");
        System.out.println("Number of CSS links: " + b.getNumberOfCSSLinks());
        
        System.out.println("------------------------");
        System.out.println("Part d");
        HTMLFilteredReader d = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
        System.out.println("Contents: " + d.getPageContents());
        //System.out.println(d.getUnfilteredPageContents());
        
        System.out.println("------------------------");
        System.out.println("Part e");
        WordSearch e = new WordSearch("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
        e.wordSearch();
        
        
        
    }
}
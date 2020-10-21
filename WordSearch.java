import java.util.Scanner;
/**
 * Auto Generated Java Class.
 */
public class WordSearch extends HTMLFilteredReader {
   
   Scanner scan = new Scanner(System.in);
   
   public WordSearch(String url){ 
      super(url);
   }
   
   public String wordSearch(){
      String text;
      text = getPageContents();
      String word;
      System.out.println("Enter the word: ");
      word = scan.nextLine();
      String display;
      display = "";
      int index;
      index = 0;
      
      while ((index = text.indexOf(word, index)) != -1 ){
         display = word + " " + index;
         index++;
      }
      return display;
   }
   
}

import java.util.Scanner;
/**
 * Auto Generated Java Class.
 */
public class WordSearch extends HTMLFilteredReader {
   
   Scanner scan = new Scanner(System.in);
   
   public WordSearch(String url){ 
      super(url);
   }
   
   public void wordSearch(){
      String text;
      text = getPageContents();
      
      String word;
      System.out.println("Enter the word: ");
      word = scan.nextLine();
      
      int index;
      index = text.indexOf(word);
      
//      int count;
//      count = 0;
      
//      for (int i = 0; i < index; i++){
//         if(text.charAt(i) == '\n')
//            count++; 
//      }
//       
      System.out.println(word + " " + index);
   }
   
}

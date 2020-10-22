/**
 *
 * @author Ceyda Dereci
 * @since 22.10.2020
 */
public class MySimpleURLReader extends cs1.SimpleURLReader {
   
   protected String url;
   
   public MySimpleURLReader(String url){
      super(url);
      this.url = url;  
   }
   
   
   public String getURL(){
      return this.url;
   }
   
   public String getName(){
      String url; 
      StringBuffer name = new StringBuffer();
      int loc;
      
      url = this.getURL(); 
      loc = 0;
      
      for(int i = url.length() - 1; i >= 0; i-- ){
         if(url.charAt(i) == '/'){
            loc = i;
            break;
         }
      }
      for(int k = loc + 1; k < url.length(); k++)
         name.append(url.charAt(k));
      
      return name.toString();
   }
   
   
   public int getNumberOfCSSLinks(){
      String str;
      int index;
      int numberOfCss;
      numberOfCss = 0;
      str = getPageContents();
      index = 0;
      while ((index = str.indexOf("stylesheet", index)) != -1 ){
         numberOfCss++;
         index++;
      }
      return numberOfCss;
      
   }
   
}

import cs1.SimpleURLReader;
/**
 *
 * @author Ceyda Dereci
 * @since 22.10.2020
 */
public class HTMLFilteredReader extends MySimpleURLReader {

    protected String url;

    public HTMLFilteredReader(String url){
        super(url);
        this.url = url;  
    }

    
    /**
     * @return String content without htlm codes
     */
    public String getPageContents2(){
       String content;
       content = getUnfilteredPageContents();
       content = content.replaceAll("\\<.*?\\>", "");
       System.out.println("After removing HTML Tags: " + content);
       return content;
    }

    /**
     * @return String content with htlm codes
     */
    public String getUnfilteredPageContents(){
       String content;
       content = getPageContents();
       return content;

    }


}
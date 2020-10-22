import cs1.SimpleURLReader;
/**
 *
 * @author Ceyda Dereci
 * @since 22.10.2020
 */
public class HTMLFilteredReader extends MySimpleURLReader {

    public HTMLFilteredReader(String url){
        super(url);
    }

    
    /**
     * @return String content without htlm codes
     */
    public String getPageContents(){
       String content;
       content = getUnfilteredPageContents();
       content = content.replaceAll("\\<.*?\\>", "");
       return content;
    }

    /**
     * @return String content with htlm codes
     */
    public String getUnfilteredPageContents(){
       String content;
       content = super.getPageContents();
       return content;

    }


}
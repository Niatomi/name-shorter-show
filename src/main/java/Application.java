import api.ParserEditor;
import api.ParserEditorImp;

public class Application {

    public static void main(String[] args) {
        //init
        ParserEditor parserEditor = new ParserEditorImp();

        String example1 = "";
        String example2 = "Peter";
        String example3 = "Sam, Peter";
        String example4 = "Jackson, Peter, Sam, Peter1";

        System.out.println(parserEditor.showLiked(example1));
        System.out.println(parserEditor.showLiked(example2));
        System.out.println(parserEditor.showLiked(example3));
        System.out.println(parserEditor.showLiked(example4));

    }
}

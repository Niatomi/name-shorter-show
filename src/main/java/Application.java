import api.ParserEditor;
import api.ParserEditorImpl;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) throws IOException {

        //init
        ParserEditor parserEditor = new ParserEditorImpl();
        List<String> listOfNames = new ArrayList<>();

        Path path = Paths.get("")
                .toAbsolutePath()
                .resolve("src")
                .resolve("main")
                .resolve("resources")
                .resolve("NAMES_DATA.csv");

        List<String> bag =
                Files.lines(path, StandardCharsets.UTF_8)
                    .flatMap(line -> Arrays.stream(line.split("\\n+")))
                    .collect(Collectors.toList());
        bag.remove(0);

        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = 0; i < bag.size(); i++) {
            if ((int)(Math.random()*2) == 1) {
                if (stringBuilder.toString() == "") {
                    stringBuilder.append(bag.get(i));
                } else {
                    stringBuilder.append(", " + bag.get(i));
                }
            } else if (stringBuilder.toString() != ""){
                listOfNames.add(stringBuilder.toString());
                stringBuilder.setLength(0);
            }
        }

        for (String s : listOfNames) {
            System.out.println(parserEditor.showLiked(s));
        }

    }
}

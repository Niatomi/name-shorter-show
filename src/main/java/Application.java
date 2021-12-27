import ru.niatomi.api.ParserEditor;
import ru.niatomi.api.ParserEditorImpl;
import ru.niatomi.generator.NameListGenerator;
import ru.niatomi.generator.NameListGeneratorImpl;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) throws IOException {

        //init
        ParserEditor parserEditor = new ParserEditorImpl();
        NameListGenerator nameListGenerator = new NameListGeneratorImpl();

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

        List<String> stringListNames = nameListGenerator.generateNames(bag);

        for (String s : stringListNames) System.out.println(parserEditor.showLiked(s));

    }
}

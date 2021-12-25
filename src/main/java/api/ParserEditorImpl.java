package api;

import jdk.nashorn.internal.objects.annotations.Constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.*;

@RequiredArgsConstructor
public class ParserEditorImpl implements ParserEditor{

    private List<String> parser(String stringOfNames) {
        List<String> listOfNames = new ArrayList<>();
        if (stringOfNames == "") return listOfNames;
        String delimeter = ", ";
        listOfNames = Arrays
                .stream(stringOfNames.split(delimeter))
                .collect(Collectors.toList());
        return listOfNames;
    }

    @Override
    public String showLiked(String baseString) {
        List<String> listString = parser(baseString);
//        System.out.println(listString.size());
        if (listString.isEmpty()) return "no one liked this";

        if (listString.size() == 1) return listString.get(0) +
                                            " likes this post";

        if (listString.size() == 2) return listString.get(0) +
                                            " and " +
                                            listString.get(1) + " liked this post";

        if (listString.size() == 3) return listString.get(0) +
                                            ", " +
                                            listString.get(1) +
                                            " and " +
                                            listString.get(2) +
                                            "liked this post";

        if (listString.size() >= 4) return listString.get(0) +
                                            ", " +
                                            listString.get(1) +
                                            " and " +
                                            (listString.size() - 2) +
                                            " more people liked this post";
        return null;
    }
}

package generator;

import java.util.ArrayList;
import java.util.List;

public class NameListGeneratorImpl implements NameListGenerator {

    @Override
    public List<String> generateNames(List<String> dataSource) {
        List<String> stringListNames = new ArrayList<>();
        String bufferName = new String("");

        for (String s : dataSource) {

            if (Math.random() < 0.5) {
                bufferName = bufferName.concat(s + ", ");
            } else {
                bufferName = "";
            }

            if (bufferName.isEmpty()) {
                stringListNames.add("");
            } else {
                stringListNames.add(bufferName.substring(0, bufferName.length() - 2));
            }

        }

        return stringListNames;
    }
}

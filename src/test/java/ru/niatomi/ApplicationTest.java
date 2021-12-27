package ru.niatomi;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ru.niatomi.api.ParserEditorImplTest;

import java.util.ArrayList;
import java.util.List;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    ParserEditorImplTest.class
})
public class ApplicationTest {
    public static final List<String> LIST_OF_TEST_NAMES = new ArrayList<>();

    @BeforeClass
    public static void onStart() {
        deleteData();
        loadData();
    }

    public static void deleteData() {
        for (int i = 0; i < LIST_OF_TEST_NAMES.size(); i++) {
            LIST_OF_TEST_NAMES.remove(i);
        }
    }

    public static void loadData() {
        LIST_OF_TEST_NAMES.add("");
        LIST_OF_TEST_NAMES.add("Name1");
        LIST_OF_TEST_NAMES.add("Name1, Name2");
        LIST_OF_TEST_NAMES.add("Name1, Name2, Name3");
        LIST_OF_TEST_NAMES.add("Name1, Name2, Name3, Name4");
        LIST_OF_TEST_NAMES.add("Name1, Name2, Name3, Name4, Name5");
        LIST_OF_TEST_NAMES.add("Name1, Name2, Name3, Name4, Name5, Name6");

    }
}

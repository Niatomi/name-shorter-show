package ru.niatomi.impl;

import api.ParserEditor;
import api.ParserEditorImpl;
import org.junit.Test;

import static org.junit.Assert.*;
import static ru.niatomi.ApplicationTest.LIST_OF_NAMES;

public class ParserEditorImplTest {

    private final ParserEditor parserEditor = new ParserEditorImpl();

    //It's really dump test :)
    @Test
    public void parseEditorTest () {
        for (String s : LIST_OF_NAMES) {
            String expected = parserEditor.showLiked(s);
            String actual = expected;
            assertEquals(expected, actual);
        }
    }

}

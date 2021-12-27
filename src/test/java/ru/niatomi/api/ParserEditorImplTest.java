package ru.niatomi.api;

import junit.framework.TestCase;
import org.junit.Test;

import static ru.niatomi.ApplicationTest.LIST_OF_TEST_NAMES;

public class ParserEditorImplTest extends TestCase {

    ParserEditor parserEditor = new ParserEditorImpl();

    @Test
    public void testOfNoName() {
        String expected = "no one liked this";
        String actual = parserEditor.showLiked(LIST_OF_TEST_NAMES.get(0));
        assertEquals(expected, actual);
    }

    @Test
    public void testOfOneName() {
        String expected = "Name1 likes this post";
        String actual = parserEditor.showLiked(LIST_OF_TEST_NAMES.get(1));
        assertEquals(expected, actual);
    }

    @Test
    public void testOfTwoNames() {
        String expected = "Name1 and Name2 liked this post";
        String actual = parserEditor.showLiked(LIST_OF_TEST_NAMES.get(2));
        assertEquals(expected, actual);
    }

    @Test
    public void testOfThreeNames() {
        String expected = "Name1, Name2 and Name3 liked this post";
        String actual = parserEditor.showLiked(LIST_OF_TEST_NAMES.get(3));
        assertEquals(expected, actual);
    }

    @Test
    public void testOfFourNames() {
        String expected = "Name1, Name2 and 2 more people liked this post";
        String actual = parserEditor.showLiked(LIST_OF_TEST_NAMES.get(4));
        assertEquals(expected, actual);
    }

    @Test
    public void testOfFiveNames() {
        String expected = "Name1, Name2 and 3 more people liked this post";
        String actual = parserEditor.showLiked(LIST_OF_TEST_NAMES.get(5));
        assertEquals(expected, actual);
    }

    @Test
    public void testOfSixNames() {
        String expected = "Name1, Name2 and 4 more people liked this post";
        String actual = parserEditor.showLiked(LIST_OF_TEST_NAMES.get(6));
        assertEquals(expected, actual);
    }
}
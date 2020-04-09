package Zadanie3;

import static org.junit.jupiter.api.Assertions.*;

import Zadanie4.MyException;
import org.junit.Test;

public class SubstringTest {
    @Test
    public void looping() throws MyException {
        Substring sub = new Substring();
        assertEquals(sub.substring("kloda", "daklodakloda"), 3);
    }
    @Test
    public void included() throws MyException {
        Substring sub = new Substring();
        assertEquals(sub.substring("song", "songsongsong"), 3);
    }
    @Test
    public void firstLonger() throws MyException {
        Substring sub = new Substring();
        assertEquals(sub.substring("kworkworkworkwo", "work"), 1);
    }
    @Test(expected = MyException.class)
    public void notIncluding() throws MyException {
        Substring sub = new Substring();
        sub.substring("ookso", "okbokb");
    }
}
package edu.fullerton.AdvSofwareProcess.InsertionSortApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SortTest {

    @Mock
    sort mockSort;


    @Test
    public void Condition_add_tooSmall() {
        boolean expectedResult = false;

        boolean actualResult = mockSort.Condition_add(-1);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Condition_add_tooBig() {
        boolean expectedResult = false;

        boolean actualResult = mockSort.Condition_add(10);

        assertEquals(expectedResult,actualResult);
    }

}

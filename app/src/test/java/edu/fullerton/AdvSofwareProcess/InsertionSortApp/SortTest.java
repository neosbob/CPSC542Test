package edu.fullerton.AdvSofwareProcess.InsertionSortApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SortTest {

    sort sortTest = new sort();

    @Test
    public void Condition_add_tooSmall() {

        boolean expectedResult = false;

        boolean actualResult = sortTest.Condition_add(-1);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Condition_add_tooBig() {
        boolean expectedResult = false;

        boolean actualResult = sortTest.Condition_add(10);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Condition_add_inRange() {
        boolean expectedResult = true;

        boolean actualResult = sortTest.Condition_add(4);



        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Condition_add_boundarytest_0() {
        boolean expectedResult = true;

        boolean actualResult = sortTest.Condition_add(0);

        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void Condition_add_boundarytest_9() {
        boolean expectedResult = true;

        boolean actualResult = sortTest.Condition_add(9);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Check_Size_arraySizeinRange() {
        boolean expectedResult = false;

        boolean actualResult = sortTest.Condition_add(0);

        assertEquals(expectedResult,actualResult);
    }


}

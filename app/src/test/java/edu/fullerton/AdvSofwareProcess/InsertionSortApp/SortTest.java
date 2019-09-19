package edu.fullerton.AdvSofwareProcess.InsertionSortApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SortTest {

    sort sortTest = new sort();

    @Test
    public void InsertionSort_ExpectedResults() {
        ArrayList<Integer> testArray = new ArrayList<Integer>(Arrays.asList(0,1,3,2,5));

        ArrayList<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(0,1,2,3,5));

        ArrayList<Integer> actualResult = sortTest.InsertionSort(testArray);

        assertEquals(expectedResult,actualResult);
    }

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
        ArrayList<Integer> testArray = new ArrayList<Integer>(Arrays.asList(0,1,3,2,5));

        int expectedResult = 0;

        int actualResult = sortTest.Check_Size(testArray);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Check_Size_arraySizeEq2() {
        ArrayList<Integer> testArray = new ArrayList<Integer>(Arrays.asList(0,1));

        int expectedResult = 0;

        int actualResult = sortTest.Check_Size(testArray);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Check_Size_arraySizeEq8() {
        ArrayList<Integer> testArray = new ArrayList<Integer>(Arrays.asList(0,1,3,2,5,6,7,8));

        int expectedResult = 0;

        int actualResult = sortTest.Check_Size(testArray);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Check_Size_arraySizeLt2() {
        ArrayList<Integer> testArray = new ArrayList<Integer>(Arrays.asList(1));

        int expectedResult = 1;

        int actualResult = sortTest.Check_Size(testArray);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Check_Size_arraySizeGt8() {
        ArrayList<Integer> testArray = new ArrayList<Integer>(Arrays.asList(0,1,3,2,5,6,8,9,7));

        int expectedResult = 2;

        int actualResult = sortTest.Check_Size(testArray);

        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void Check_Size_arraySizeEmpty() {
        ArrayList<Integer> testArray = new ArrayList<Integer>();

        int expectedResult = 1;

        int actualResult = sortTest.Check_Size(testArray);

        assertEquals(expectedResult,actualResult);
    }


}

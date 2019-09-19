package edu.fullerton.AdvSofwareProcess.InsertionSortApp

import com.google.common.truth.Truth

import org.junit.Test

import org.junit.Assert.*

class Sort_Test {
    @Test
    fun InsertionSort_CorrectArray() {
        val test_array: IntArray = IntArrayOf(0,1,3,2,5)
        val expected_result: IntArray = IntArrayOf(0,1,2,3,5)
        sort.InsertionSort(test_array)
        assertThat( test_array == expected_result).isTrue()
    }

    @Test
    fun Condition_add_intvalue() {
        assertThat(sort.Condition_add(0) == True).isTrue()
        assertThat(sort.Condition_add(9) == True).isTrue()
        assertThat(sort.Condition_add(4) == True).isTrue()
        assertThat(sort.Condition_add(-1) == False).isTrue()
        assertThat(sort.Condition_add(10) == False).isTrue()
    }

    @Test
    fun Check_Size_returnvalue() {
        val test_array: IntArray = IntArrayOf(0,1,3,2,5)
        val test_array_eq2: IntArray = IntArrayOf(0,1)
        val test_array_eq8: IntArray = IntArrayOf(0,1,3,2,5,6,7,8)
        val test_array_lt2: IntArray = IntArrayOf(1)
        val test_array_gt8: IntArray = IntArrayOf(0,1,3,2,5,6,8,9,7)

        assertThat(sort.CheckSize(test_array) == 0).isTrue()
        assertThat(sort.CheckSize(test_array_eq2) == 0).isTrue()
        assertThat(sort.CheckSize(test_array_eq8) == 0).isTrue()
        assertThat(sort.CheckSize(test_array_lt2) == 1).isTrue()
        assertThat(sort.CheckSize(test_array_gt8) == 2).isTrue()
    }
}

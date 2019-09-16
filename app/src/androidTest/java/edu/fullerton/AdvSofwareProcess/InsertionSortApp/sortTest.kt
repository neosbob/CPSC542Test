package edu.fullerton.AdvSofwareProcess.InsertionSortApp

import android.os.SystemClock
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import androidx.test.rule.ActivityTestRule
import org.junit.Test

import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@SmallTest

class sortTest {
    @get:Rule
    var activityRule: ActivityTestRule<sort> = ActivityTestRule(sort::class.java)
    val InputwithComma = "5,4,6,4,2,1"
    val InputwithSpace = "5 8 9 3 2 4"
    val ErrorSize ="1 2 3 4 5 6 7 8 9"
    val InvalidInput ="11"

    fun TestValidInput(res:String) {



        onView(withId(R.id.input))
            .perform(typeText(res))
        Espresso.closeSoftKeyboard()

        onView(withId(R.id.add)).perform(click())
        onView(withId(R.id.input))
            .perform(clearText())
        SystemClock.sleep(3000);


        onView((withId(R.id.process))).perform(click())
        SystemClock.sleep(3000);

        onView((withId(R.id.clear))).perform(click())
        SystemClock.sleep(3000);


    }

    fun TestInvalidInput(res:String) {



        onView(withId(R.id.input))
            .perform(typeText(res))
        Espresso.closeSoftKeyboard()

        onView(withId(R.id.add)).perform(click())
        onView(withId(R.id.input))
            .perform(clearText())
        SystemClock.sleep(3000);


        onView((withId(R.id.process))).perform(click())
        SystemClock.sleep(3000);


    }



    @Test
    fun Perform_InputValidTest(){

        TestValidInput(InputwithComma)

        TestValidInput(InputwithSpace)


    }
    @Test
    fun Perform_InputInvalidTest(){

        TestInvalidInput(ErrorSize)
        TestInvalidInput(InvalidInput)
    }






}
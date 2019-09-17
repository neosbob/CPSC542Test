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

    @Test
    fun TestInputWithComma() {

        onView(withId(R.id.input))
            .perform(typeText("5,4,6,4,2,1"))
        Espresso.closeSoftKeyboard()

        onView(withId(R.id.add)).perform(click())
        onView(withId(R.id.input))
            .perform(clearText())

        onView((withId(R.id.process))).perform(click())

        onView((withId(R.id.clear))).perform(click())

    }
    @Test
    fun TestInputWithSpace() {

        onView(withId(R.id.input))
            .perform(typeText("5 8 9 3 2 4"))
        Espresso.closeSoftKeyboard()

        onView(withId(R.id.add)).perform(click())
        onView(withId(R.id.input))
            .perform(clearText())

        onView((withId(R.id.process))).perform(click())

        onView((withId(R.id.clear))).perform(click())

    }
    @Test
    fun TestInvalidMaximumSize() {

        onView(withId(R.id.input))
            .perform(typeText("1 2 3 4 5 6 7 8 9"))
        Espresso.closeSoftKeyboard()

        onView(withId(R.id.add)).perform(click())
        onView(withId(R.id.input))
            .perform(clearText())
        onView((withId(R.id.process))).perform(click())

    }

    @Test
    fun TestInvalidInput() {

        onView(withId(R.id.input))
            .perform(typeText("11"))
        Espresso.closeSoftKeyboard()

        onView(withId(R.id.add)).perform(click())
        onView(withId(R.id.input))
            .perform(clearText())
        onView((withId(R.id.process))).perform(click())

    }

}
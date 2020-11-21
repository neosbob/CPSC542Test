package edu.fullerton.AdvSofwareProcess.InsertionSortApp

import android.os.SystemClock
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import androidx.test.rule.ActivityTestRule
import org.junit.Test

import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@SmallTest

class recordTest {
    @get:Rule
    var activityRule: ActivityTestRule<record> = ActivityTestRule(record::class.java)

    @Test
    fun ACTIONBAR_TEST() {
        // Context of the app under test.
        onView(withId(R.id.sorting)).perform(click())
        onView(ViewMatchers.isRoot()).perform(ViewActions.pressBack())
        onView(withId(R.id.aboutus)).perform(click())
    }

    @Test
    fun SCROLLVIEW_TEST() {
        // Context of the app under test.
        onView(ViewMatchers.isRoot()).perform(ViewActions.swipeUp())
    }
}
package edu.fullerton.AdvSofwareProcess.InsertionSortApp

import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import androidx.test.rule.ActivityTestRule
import org.junit.Test

import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@SmallTest


class MainActivityTest {
    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun View_test () {
        // this test for textview app name
        onView(withId(R.id.welcome_title_text))
            .check(matches(withText("Insertion Sort App")))
        // gifview test id
        onView(withId(R.id.gifImageView2)).check(matches(withResourceName("gifImageView2")))

    }
    @Test
    fun ACTIONBAR_TEST() {
        // Context of the app under test.
        onView(withId(R.id.sorting)).perform(click())
        onView(isRoot()).perform(ViewActions.pressBack());
        onView(withId(R.id.aboutus)).perform(click())
        onView(withId(R.id.records)).perform(click())
    }
}



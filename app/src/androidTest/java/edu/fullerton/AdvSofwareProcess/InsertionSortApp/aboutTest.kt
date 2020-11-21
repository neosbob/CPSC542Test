package edu.fullerton.AdvSofwareProcess.InsertionSortApp

import android.os.SystemClock
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.web.assertion.WebViewAssertions.webMatches
import androidx.test.espresso.web.model.Atoms.getCurrentUrl
import androidx.test.espresso.web.sugar.Web.onWebView
import androidx.test.espresso.web.webdriver.DriverAtoms.findElement
import androidx.test.espresso.web.webdriver.DriverAtoms.webClick
import androidx.test.espresso.web.webdriver.Locator
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import androidx.test.rule.ActivityTestRule
import org.hamcrest.CoreMatchers.containsString
import org.junit.Test

import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@SmallTest

class aboutTest {
    @get:Rule
    var activityRule: ActivityTestRule<about> = ActivityTestRule(about::class.java)

    @Test
    fun _testWebViewInteraction() {
        onWebView().forceJavascriptEnabled()
    }

    @Test
    fun ACTIONBAR_TEST() {
        // Context of the app under test.
        onView(withId(R.id.sorting)).perform(click())
        onView(ViewMatchers.isRoot()).perform(ViewActions.pressBack())
        onView(withId(R.id.records)).perform(click())
    }

    @Test
    fun SCROLLVIEW_TEST() {
        // Context of the app under test.
        onView(ViewMatchers.isRoot()).perform(ViewActions.swipeUp())
    }

    @Test
    fun WEBVIEW_MEMBER1_TEST() {
        // Context of the app under test.

        //facebook link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[1]/div/a[1]"))
            .perform(webClick())
        SystemClock.sleep(1000)

        //instagram link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[1]/div/a[2]"))
            .perform(webClick())
        SystemClock.sleep(1000)

        //linkedin link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[1]/div/a[3]"))
            .perform(webClick())
        SystemClock.sleep(1000)

        //twitter link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[1]/div/a[4]"))
            .perform(webClick())
        SystemClock.sleep(1000)
    }

    @Test
    fun WEBVIEW_MEMBER2_TEST() {
        // Context of the app under test.

        // website link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[2]/div/a[1]"))
            .perform(webClick())
        SystemClock.sleep(1000)

        //instagram link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[2]/div/a[2]"))
            .perform(webClick())
            .reset()
        SystemClock.sleep(1000)

        //linkedin link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[2]/div/a[3]"))
            .perform(webClick())
        SystemClock.sleep(1000)
    }

    @Test
    fun WEBVIEW_MEMBER3_TEST() {
        // Context of the app under test.

        //facebook link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[3]/div/a[1]"))
            .perform(webClick())
        SystemClock.sleep(1000)

        //instagram link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[3]/div/a[2]"))
            .perform(webClick())
        SystemClock.sleep(1000)

        //linkedin link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[3]/div/a[3]"))
            .perform(webClick())
        SystemClock.sleep(1000)

        //twitter link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[3]/div/a[4]"))
            .perform(webClick())
        SystemClock.sleep(1000)
    }

    @Test
    fun WEBVIEW_MEMBER4_TEST() {
        // Context of the app under test.

        //facebook link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[4]/div/a[1]"))
            .perform(webClick())
        SystemClock.sleep(1000)

        //instagram link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[4]/div/a[2]"))
            .perform(webClick())
        SystemClock.sleep(1000)

        //linkedin link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[4]/div/a[3]"))
            .perform(webClick())
        SystemClock.sleep(1000)

        //twitter link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[4]/div/a[4]"))
            .perform(webClick())
        SystemClock.sleep(1000)
    }

    @Test
    fun WEBVIEW_MEMBER5_TEST() {
        // Context of the app under test.
        //facebook link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[5]/div/a[1]"))
            .perform(webClick())
        SystemClock.sleep(1000)

        //instagram link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[5]/div/a[2]"))
            .perform(webClick())
        SystemClock.sleep(1000)

        //linkedin link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[5]/div/a[3]"))
            .perform(webClick())
        SystemClock.sleep(1000)

        //twitter link test
        onWebView()
            .withElement(findElement(Locator.XPATH, "//*[@id=\"profiles\"]/div/div[2]/div/div[5]/div/a[4]"))
            .perform(webClick())
        SystemClock.sleep(1000)
    }
}
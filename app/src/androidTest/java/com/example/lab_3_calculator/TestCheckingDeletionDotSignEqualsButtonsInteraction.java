package com.example.lab_3_calculator;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestCheckingDeletionDotSignEqualsButtonsInteraction {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testCheckingDeletionDotSignEqualsButtonsInteraction() {
        ViewInteraction materialButton = onView(
                allOf(withId(R.id.button_9), withText("9"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        1),
                                2),
                        isDisplayed()));
        materialButton.perform(click());

        ViewInteraction materialButton2 = onView(
                allOf(withId(R.id.button_9), withText("9"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        1),
                                2),
                        isDisplayed()));
        materialButton2.perform(click());

        ViewInteraction materialButton3 = onView(
                allOf(withId(R.id.button_c), withText("C"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        0),
                                0),
                        isDisplayed()));
        materialButton3.perform(click());

        ViewInteraction textView = onView(
                allOf(withId(R.id.result_tv), withText("9"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView.check(matches(withText("9")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.solution_tv), withText("9"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView2.check(matches(withText("9")));

        ViewInteraction materialButton4 = onView(
                allOf(withId(R.id.button_c), withText("C"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        0),
                                0),
                        isDisplayed()));
        materialButton4.perform(click());

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.solution_tv),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView3.check(matches(withText("")));

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.result_tv), withText("0"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView4.check(matches(withText("0")));

        ViewInteraction materialButton5 = onView(
                allOf(withId(R.id.button_dot), withText("."),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        4),
                                2),
                        isDisplayed()));
        materialButton5.perform(click());

        ViewInteraction materialButton6 = onView(
                allOf(withId(R.id.button_3), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        3),
                                2),
                        isDisplayed()));
        materialButton6.perform(click());

        ViewInteraction materialButton7 = onView(
                allOf(withId(R.id.button_3), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        3),
                                2),
                        isDisplayed()));
        materialButton7.perform(click());

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.solution_tv), withText(".33"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView5.check(matches(withText(".33")));

        ViewInteraction textView6 = onView(
                allOf(withId(R.id.result_tv), withText("0.33"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView6.check(matches(withText("0.33")));

        ViewInteraction materialButton8 = onView(
                allOf(withId(R.id.button_equals), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        4),
                                3),
                        isDisplayed()));
        materialButton8.perform(click());

        ViewInteraction textView7 = onView(
                allOf(withId(R.id.solution_tv), withText("0.33"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView7.check(matches(withText("0.33")));

        ViewInteraction materialButton9 = onView(
                allOf(withId(R.id.button_ac), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        0),
                                1),
                        isDisplayed()));
        materialButton9.perform(click());

        ViewInteraction textView8 = onView(
                allOf(withId(R.id.solution_tv),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView8.check(matches(withText("")));

        ViewInteraction textView9 = onView(
                allOf(withId(R.id.result_tv), withText("0"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView9.check(matches(withText("0")));
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}

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
public class TestCheckingAllButtonsInteraction {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testCheckingAllButtonsInteraction() {
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
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        0),
                                3),
                        isDisplayed()));
        materialButton3.perform(click());

        ViewInteraction materialButton4 = onView(
                allOf(withId(R.id.button_3), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        3),
                                2),
                        isDisplayed()));
        materialButton4.perform(click());

        ViewInteraction materialButton5 = onView(
                allOf(withId(R.id.button_equals), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        4),
                                3),
                        isDisplayed()));
        materialButton5.perform(click());

        ViewInteraction materialButton6 = onView(
                allOf(withId(R.id.button_plus), withText("+"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        2),
                                3),
                        isDisplayed()));
        materialButton6.perform(click());

        ViewInteraction materialButton7 = onView(
                allOf(withId(R.id.button_9), withText("9"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        1),
                                2),
                        isDisplayed()));
        materialButton7.perform(click());

        ViewInteraction materialButton8 = onView(
                allOf(withId(R.id.button_6), withText("6"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        2),
                                2),
                        isDisplayed()));
        materialButton8.perform(click());

        ViewInteraction materialButton9 = onView(
                allOf(withId(R.id.button_minus), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        3),
                                3),
                        isDisplayed()));
        materialButton9.perform(click());

        ViewInteraction materialButton10 = onView(
                allOf(withId(R.id.button_3), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        3),
                                2),
                        isDisplayed()));
        materialButton10.perform(click());

        ViewInteraction materialButton11 = onView(
                allOf(withId(R.id.button_2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        3),
                                1),
                        isDisplayed()));
        materialButton11.perform(click());

        ViewInteraction materialButton12 = onView(
                allOf(withId(R.id.button_multiply), withText("*"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        1),
                                3),
                        isDisplayed()));
        materialButton12.perform(click());

        ViewInteraction materialButton13 = onView(
                allOf(withId(R.id.button_9), withText("9"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        1),
                                2),
                        isDisplayed()));
        materialButton13.perform(click());

        ViewInteraction materialButton14 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        0),
                                3),
                        isDisplayed()));
        materialButton14.perform(click());

        ViewInteraction materialButton15 = onView(
                allOf(withId(R.id.button_3), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        3),
                                2),
                        isDisplayed()));
        materialButton15.perform(click());

        ViewInteraction materialButton16 = onView(
                allOf(withId(R.id.button_minus), withText("-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        3),
                                3),
                        isDisplayed()));
        materialButton16.perform(click());

        ViewInteraction materialButton17 = onView(
                allOf(withId(R.id.button_2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        3),
                                1),
                        isDisplayed()));
        materialButton17.perform(click());

        ViewInteraction materialButton18 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        0),
                                3),
                        isDisplayed()));
        materialButton18.perform(click());

        ViewInteraction materialButton19 = onView(
                allOf(withId(R.id.button_3), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        3),
                                2),
                        isDisplayed()));
        materialButton19.perform(click());

        ViewInteraction materialButton20 = onView(
                allOf(withId(R.id.button_2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        3),
                                1),
                        isDisplayed()));
        materialButton20.perform(click());

        ViewInteraction textView = onView(
                allOf(withId(R.id.solution_tv), withText("33+96-32*9/3-2/32"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView.check(matches(withText("33+96-32*9/3-2/32")));

        ViewInteraction textView2 = onView(
                allOf(withId(R.id.result_tv), withText("32.9375"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView2.check(matches(withText("32.9375")));

        ViewInteraction materialButton21 = onView(
                allOf(withId(R.id.button_c), withText("C"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        0),
                                0),
                        isDisplayed()));
        materialButton21.perform(click());

        ViewInteraction textView3 = onView(
                allOf(withId(R.id.solution_tv), withText("33+96-32*9/3-2/3"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView3.check(matches(withText("33+96-32*9/3-2/3")));

        ViewInteraction textView4 = onView(
                allOf(withId(R.id.result_tv), withText("32.333333333333336"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView4.check(matches(withText("32.333333333333336")));

        ViewInteraction materialButton22 = onView(
                allOf(withId(R.id.button_2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        3),
                                1),
                        isDisplayed()));
        materialButton22.perform(click());

        ViewInteraction materialButton23 = onView(
                allOf(withId(R.id.button_equals), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        4),
                                3),
                        isDisplayed()));
        materialButton23.perform(click());

        ViewInteraction materialButton24 = onView(
                allOf(withId(R.id.button_change_sign), withText("+-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        4),
                                0),
                        isDisplayed()));
        materialButton24.perform(click());

        ViewInteraction textView5 = onView(
                allOf(withId(R.id.solution_tv), withText("-32.9375"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView5.check(matches(withText("-32.9375")));

        ViewInteraction textView6 = onView(
                allOf(withId(R.id.result_tv), withText("-32.9375"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView6.check(matches(withText("-32.9375")));

        ViewInteraction materialButton25 = onView(
                allOf(withId(R.id.button_change_sign), withText("+-"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        4),
                                0),
                        isDisplayed()));
        materialButton25.perform(click());

        ViewInteraction materialButton26 = onView(
                allOf(withId(R.id.button_sqrt), withText("sqrt"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        0),
                                2),
                        isDisplayed()));
        materialButton26.perform(click());

        ViewInteraction textView7 = onView(
                allOf(withId(R.id.result_tv), withText("5.739120141624499"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView7.check(matches(withText("5.739120141624499")));

        ViewInteraction textView8 = onView(
                allOf(withId(R.id.solution_tv), withText("5.739120141624499"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView8.check(matches(withText("5.739120141624499")));

        ViewInteraction materialButton27 = onView(
                allOf(withId(R.id.button_ac), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        0),
                                1),
                        isDisplayed()));
        materialButton27.perform(click());

        ViewInteraction textView9 = onView(
                allOf(withId(R.id.result_tv), withText("0"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView9.check(matches(withText("0")));

        ViewInteraction textView10 = onView(
                allOf(withId(R.id.solution_tv),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView10.check(matches(withText("")));

        ViewInteraction materialButton28 = onView(
                allOf(withId(R.id.button_dot), withText("."),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        4),
                                2),
                        isDisplayed()));
        materialButton28.perform(click());

        ViewInteraction materialButton29 = onView(
                allOf(withId(R.id.button_3), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        3),
                                2),
                        isDisplayed()));
        materialButton29.perform(click());

        ViewInteraction materialButton30 = onView(
                allOf(withId(R.id.button_divide), withText("/"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        0),
                                3),
                        isDisplayed()));
        materialButton30.perform(click());

        ViewInteraction materialButton31 = onView(
                allOf(withId(R.id.button_2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        3),
                                1),
                        isDisplayed()));
        materialButton31.perform(click());

        ViewInteraction materialButton32 = onView(
                allOf(withId(R.id.button_2), withText("2"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        3),
                                1),
                        isDisplayed()));
        materialButton32.perform(click());

        ViewInteraction materialButton33 = onView(
                allOf(withId(R.id.button_equals), withText("="),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        4),
                                3),
                        isDisplayed()));
        materialButton33.perform(click());

        ViewInteraction materialButton34 = onView(
                allOf(withId(R.id.button_ac), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        0),
                                1),
                        isDisplayed()));
        materialButton34.perform(click());

        ViewInteraction materialButton35 = onView(
                allOf(withId(R.id.button_ac), withText("AC"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.buttons_layout),
                                        0),
                                1),
                        isDisplayed()));
        materialButton35.perform(click());

        ViewInteraction textView11 = onView(
                allOf(withId(R.id.result_tv), withText("0"),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));
        textView11.check(matches(withText("0")));
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

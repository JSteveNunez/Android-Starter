package com.jstevenunez.androidstarter.activity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import com.jstevenunez.androidstarter.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by kryonex on 022, 2/22/2015.
 */

@LargeTest
public class AndroidStarterEspressoTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public AndroidStarterEspressoTest() {
        super(MainActivity.class);
    }
    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }
    public void testActivityShouldHaveText() throws InterruptedException {
        onView(withId(R.id.text)).check(matches(withText("Hello Espresso!")));
    }
}
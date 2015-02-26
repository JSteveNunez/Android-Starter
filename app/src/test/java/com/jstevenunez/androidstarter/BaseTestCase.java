package com.jstevenunez.androidstarter;

import com.jstevenunez.androidstarter.activity.MainActivity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

/**
 * Created by kryonex on 022, 2/22/2015.
 */

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", emulateSdk = 18)
public class BaseTestCase {
    @Test
    public void testSomething() throws Exception {
        assertTrue(Robolectric.buildActivity(MainActivity.class).create().get() != null);
    }

}

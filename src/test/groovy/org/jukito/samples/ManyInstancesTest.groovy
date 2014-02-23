package org.jukito.samples

import org.jukito.All
import org.jukito.JukitoRunner
import org.jukito.TestModule
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Created by nnombela on 2/22/14.
 */
@RunWith(JukitoRunner)
class ManyInstancesTest {

    public static class Module extends TestModule {
        protected void configureTest() {
            bindManyInstances(String.class, "Hello", "world");
        }
    }

    @Test
    void print(@All String s) {
        println s
    }



}

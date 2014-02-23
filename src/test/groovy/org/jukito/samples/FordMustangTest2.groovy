package org.jukito.samples

import org.jukito.JukitoModule
import org.jukito.JukitoRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Spy

import javax.inject.Inject

import static org.mockito.Mockito.*;


/**
 * A simple test with one real DOC (binding in test)
 */
@RunWith(JukitoRunner.class)
class FordMustangTest2 {
    public static class Module extends JukitoModule {
        @Override
        protected void configureTest() {

            // Diesel in Mustang, yeaah I know :)
            bind(Engine.class).to(DieselEngine.class);

            // necessary if you want to verify interaction on real object
            bindSpy(DieselEngine.class);
        }
    }

    @Inject
    FordMustang mustang;

    @Test
    public void shouldInitiateIgnitionWhenCarStart() throws Exception {
        // Given

        // Then
        mustang.startEngine();

        // Then
        verify(mustang.getEngine()).initiateIgnition();
    }
}

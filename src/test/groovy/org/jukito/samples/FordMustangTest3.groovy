package org.jukito.samples

import org.jukito.JukitoModule
import org.jukito.JukitoRunner
import org.jukito.samples.modules.DieselLineModule
import org.junit.Test
import org.junit.runner.RunWith

import javax.inject.Inject

import static org.mockito.Mockito.*;


/**
 * A simple test with one real DOC (binding via module installation)
 */
@RunWith(JukitoRunner.class)
class FordMustangTest3 {
    /**
     * JukitoModule.
     */
    public static class Module extends JukitoModule {
        @Override
        protected void configureTest() {

            // install yours module as you wish
            install(new DieselLineModule());

            // necessary if you want to verify interaction on real object
            bindSpy(DieselEngine.class);
        }
    }

    @Inject
    FordMustang sut;

    @Test
    public void shouldInitiateIgnitionWhenCarStart() throws Exception {
        // Given

        // When
        sut.startEngine();

        // Then
        verify(sut.getEngine()).initiateIgnition();
    }
}

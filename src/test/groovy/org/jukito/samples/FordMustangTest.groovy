package org.jukito.samples

import org.jukito.JukitoRunner
import org.junit.Test
import org.junit.runner.RunWith

import javax.inject.Inject

import static org.mockito.Mockito.*;

/**
 * A simple test with one mock (engine) and one real object (FordMustang)
 */
@RunWith(JukitoRunner.class)
class FordMustangTest {

    @Inject
    FordMustang mustang;

    @Test
    public void shouldInitiateIgnitionWhenCarStart() throws Exception {
        // Given

        // When
        mustang.startEngine();

        // Then
        verify(mustang.getEngine()).initiateIgnition();
    }
}

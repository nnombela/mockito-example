package org.mockito.samples

import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

import static org.mockito.Mockito.*;

/**
 * Created by nnombela on 2/22/14.
 */
class MockingTest {
    @Mock
    List<String> mockedList

    @Before
    void SetUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void sanityCheck() {
        mockedList.add("one")
        mockedList.clear();

        mockedList.add("three")
        mockedList.add("three")
        mockedList.add("three")

        verify(mockedList).add("one")
        verify(mockedList).clear();
        verify(mockedList, times(3)).add("three")
        verify(mockedList, atLeastOnce()).add("three")
    }
}

package org.mockito.samples

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.Spy
import org.mockito.runners.MockitoJUnitRunner

import static org.mockito.Mockito.*;

/**
 * Created by nnombela on 2/22/14.
 */
@RunWith(MockitoJUnitRunner)
class StubbingTest {
    @Mock
    LinkedList<String> mockedList

    @Spy
    List list = new LinkedList()

    @Before
    void SetUp() throws Exception {
        //MockitoAnnotations.initMocks(this);   // replace by @RunWith annotation
    }

    @Test
    void testWithStubbed() {
        when(mockedList.get(0)).thenReturn("first")

        when(mockedList.get(1)).thenThrow(
            new RuntimeException()
        )

        println mockedList.get(0)
        //println mockedList.get(1)

        println mockedList.get(999)

        verify(mockedList).get(0)

    }

    @Test
    void testWithMatchers() {
        when(
            mockedList.get(anyInt())
        ) thenReturn (
            "element"
        )


        println mockedList.get(999)

        verify(mockedList).get(anyInt())

    }

    @Test
    void testWithSpied() {

        when(list.size()).thenReturn(100)

        list.add("one")
        list.add("two")

        println list.get(0)
        println list.size()

        verify(list).add("one")
        verify(list).add("two")

    }



}

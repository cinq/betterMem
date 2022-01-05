package com.cinq.betterMem

import com.cinq.betterMem.model.Person
import kotlin.test.DefaultAsserter.assertEquals
import kotlin.test.Test

class PersonTest {

    @Test
    fun PersonTest(){
        val p = Person(999,"Martin", "yesterday", "1986-09-12")

        assertEquals("Martin", "Martin", p.firstname)

    }

}

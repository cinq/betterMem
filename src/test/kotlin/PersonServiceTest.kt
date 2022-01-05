package com.cinq.betterMem

import com.cinq.betterMem.service.PersonService
import kotlin.test.DefaultAsserter.assertEquals
import kotlin.test.Test

class PersonServiceTest {

    @Test
    fun givenId1_findBy_firstnameIsFrancisTest(){
        val personService = PersonService();
        assertEquals("Francis","Francis", personService.findById(1)?.firstname ?: String)
    }

    @Test
    fun givenId2_findBy_firstnameIsJen(){
        val personService = PersonService();
        assertEquals("Jen","Jen", personService.findById(2)?.firstname ?: String)
    }
}
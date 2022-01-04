package com.cinq.betterMem.service

import com.cinq.betterMem.model.Person
import org.springframework.stereotype.Service

@Service
class PersonService {

    /*
    Populate the people to have some data
     */
    val p1 = Person(1, "Francis", "Capolla", "1975-02-08")
    val p2 = Person(2, "Jen", "Aniston", "1976-06-21")

    /*
    Quick and dirty findBy
     */
    fun findById(id: Long?): Person? {
        if (p1.id == id) return p1
        if (p2.id == id) return p2
        return null
    }
}
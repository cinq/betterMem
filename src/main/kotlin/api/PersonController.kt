package com.cinq.betterMem.api

import com.cinq.betterMem.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonController(private val personService: PersonService) {

    @GetMapping("/person")
    fun allPeople(model: Model): String {
        model["title"] = "People"
        return "people"
    }

    @GetMapping("/person/{id}")
    @ResponseBody
    fun person(model: Model, @PathVariable("id") id: Long?): String {
        val person = personService.findById(id)
        return "person: ${person}"
    }

}
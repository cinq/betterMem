package com.cinq.betterMem.api

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonController {

    @GetMapping("/person")
    fun allPeople(model: Model): String {
        model["title"] = "People"
        return "people"
    }

}
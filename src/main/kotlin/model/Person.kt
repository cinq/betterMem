package com.cinq.betterMem.model

class Person(val id: Long, val firstname: String,val lastname: String, val birthday: String) {

    override fun toString(): String {
        return "Person(id=$id, firstname='$firstname', lastname='$lastname', birthday='$birthday')"
    }

}
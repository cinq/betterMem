package com.cinq.betterMem

import com.cinq.betterMem.model.Person
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

@Test
fun PersonTest(){
    val p = Person(999,"Martin", "yesterday", "1986-09-12")

    assertThat(p.firstname).isEqualTo("Martin")
}

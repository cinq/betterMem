package com.cinq.betterMem

import com.cinq.betterMem.model.Person
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

@Test
fun PersonTest(){
    val p = Person("Martin", "yesterday")

    assertThat(p.name).isEqualTo("Martin")
}

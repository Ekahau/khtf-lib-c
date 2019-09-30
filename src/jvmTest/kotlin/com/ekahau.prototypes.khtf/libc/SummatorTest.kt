package com.ekahau.prototypes.khtf.libc

import kotlin.test.Test
import kotlin.test.assertEquals

class SummatorTest {

    @Test
    fun testSum() {
        assertEquals(12, Summator().sum(1, 2))
    }

}
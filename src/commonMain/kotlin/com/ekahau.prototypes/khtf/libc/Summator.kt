package com.ekahau.prototypes.khtf.libc

import com.ekahau.prototypes.khtf.libb.Summator

class Summator {
    //should use lib-b
    fun sum(a: Int, b: Int): Int = Summator.sum(a, b)
}
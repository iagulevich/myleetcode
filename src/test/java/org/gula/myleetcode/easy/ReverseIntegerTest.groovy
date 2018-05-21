package org.gula.myleetcode.easy

import spock.lang.Specification

class ReverseIntegerTest extends Specification {

    def "Reverse"() {

        expect:
        new ReverseInteger().reverse(input) == result
        where:
        input || result
        123   || 321
        -123  || -321
        1534236469 || 0
        -1534236469 || 0

    }
}

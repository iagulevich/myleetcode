package org.gula.myleetcode.easy

import spock.lang.Specification

class DivisorGameTest extends Specification {
    def "DivisorGame"() {
        expect:
        new DivisorGame().divisorGame(number) == result
        where:
        number | result
        2      | true
        3      | false
        4      | true
    }
}

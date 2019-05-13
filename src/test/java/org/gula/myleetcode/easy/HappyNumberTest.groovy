package org.gula.myleetcode.easy

import spock.lang.Specification

class HappyNumberTest extends Specification {
    def "IsHappy"() {
        expect:
        new HappyNumber().isHappy(number) == result
        where:
        number | result
        19     | true
        1      | true
        2      | false
    }
}

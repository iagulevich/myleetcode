package org.gula.myleetcode.easy

import spock.lang.Specification

class RomanToIntTest extends Specification {

    def "Roman to int"() {
        expect:
        new RomanToInt().romanToInt(input) == result
        where:
        input     || result
        "III"     || 3
        "IV"      || 4
        "IX"      || 9
        "LVIII"   || 58
        "MCMXCIV" || 1994
        "MDCXCV"  || 1695
    }
}

package org.gula.myleetcode.easy

import spock.lang.Specification

class JewelsAndStonesTest extends Specification {

    def "Num Jewels In Stones"() {
        expect:
        new JewelsAndStones().numJewelsInStones(J, S) == result
        where:
        S    || J         || result
        "aA" || "aAAbbbb" || 3
        "z"  || "ZZ"      || 0
    }
}

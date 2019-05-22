package org.gula.myleetcode.easy

import spock.lang.Specification

class LastStoneWeightTest extends Specification {
    def "LastStoneWeight"() {
        expect:
        new LastStoneWeight().lastStoneWeight(stones as int[]) == result
        where:
        stones             | result
        [2, 7, 4, 1, 8, 1] | 1
    }
}

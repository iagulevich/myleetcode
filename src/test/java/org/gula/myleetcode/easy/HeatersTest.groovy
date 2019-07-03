package org.gula.myleetcode.easy

import spock.lang.Specification

class HeatersTest extends Specification {
    def "FindRadius"() {
        expect:
        new Heaters().findRadius(houses as int[], heaters as int[]) == result
        where:
        houses       | heaters | result
//        [1, 2, 3]    | [2]     | 1
        [1, 2, 3, 4] | [1, 4]  | 1
//        [1, 5]       | [2]     | 3
    }
}

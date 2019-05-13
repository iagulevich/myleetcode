package org.gula.myleetcode.easy

import spock.lang.Specification

class SubMissionsTest extends Specification {
    def "SingleNumber"() {
        expect:
        new SubMissions().singleNumber(nums as int[]) == result
        where:
        nums            | result
        [2, 2, 1]       | 1
        [4, 1, 2, 1, 2] | 4
    }
}

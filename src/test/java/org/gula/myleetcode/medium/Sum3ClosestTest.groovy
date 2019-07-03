package org.gula.myleetcode.medium

import spock.lang.Specification

class Sum3ClosestTest extends Specification {
    def "ThreeSumClosest"() {
        expect:
        new Sum3Closest().threeSumClosest(nums as int[], target) == result
        where:
        nums           | target | result
        [-1, 2, 1, -4] | 1      | 2

    }
}

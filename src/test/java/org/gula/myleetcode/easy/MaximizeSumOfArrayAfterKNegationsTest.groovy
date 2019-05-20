package org.gula.myleetcode.easy

import spock.lang.Specification

class MaximizeSumOfArrayAfterKNegationsTest extends Specification {
    def "LargestSumAfterKNegations"() {
        expect:
        new MaximizeSumOfArrayAfterKNegations().largestSumAfterKNegations(a as int[], k) == result
        where:
        a                       | k | result
        [4, 2, 3]               | 1 | 5
        [3, -1, 0, 2]           | 3 | 6
        [2, -3, -1, 5, -4]      | 2 | 13
        [-8, 3, -5, -3, -5, -2] | 6 | 22
    }
}

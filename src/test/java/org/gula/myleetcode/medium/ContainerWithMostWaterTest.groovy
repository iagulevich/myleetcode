package org.gula.myleetcode.medium

import spock.lang.Specification

class ContainerWithMostWaterTest extends Specification {
    def "Max area"() {
        expect:
        new ContainerWithMostWater().maxArea(input as int[]) == result
        where:
        input                       || result
        [5, 6]                      || 5
        [1, 5, 6, 6]                || 10
        [1, 8, 6, 2, 5, 4, 8, 3, 7] || 49
    }
}

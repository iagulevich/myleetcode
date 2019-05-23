package org.gula.myleetcode.easy

import spock.lang.Specification

class PositionsOfLargeGroupsTest extends Specification {
    def "LargeGroupPositions"() {
        expect:
        new PositionsOfLargeGroups().largeGroupPositions(s) == result
        where:
        s                   | result
        "abbxxxxzzy"        | [[3, 6]]
        "abc"               | []
        "abcdddeeeeaabbbcd" | [[3, 5], [6, 9], [12, 14]]
        "aaa"               | [[0, 2]]
    }
}

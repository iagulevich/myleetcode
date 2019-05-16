package org.gula.myleetcode.easy

import spock.lang.Specification

class SearchInsertPositionTest extends Specification {
    def "SearchInsert"() {
        expect:
        new SearchInsertPosition().searchInsert(nums as int[], target) == result
        where:
        nums         | target | result
        [1, 3, 5, 6] | 5      | 2
        [1, 3, 5, 6] | 2      | 1
        [1, 3, 5, 6] | 7      | 4
        [1, 3, 5, 6] | 0      | 0
    }
}

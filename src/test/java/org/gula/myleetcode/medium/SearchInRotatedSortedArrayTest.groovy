package org.gula.myleetcode.medium

import spock.lang.Specification

class SearchInRotatedSortedArrayTest extends Specification {
    def "Search"() {
        expect:
        new SearchInRotatedSortedArray().search(nums as int[], target) == result
        where:
        nums                  | target | result
        [4, 5, 6, 7, 0, 1, 2] | 0      | 4
        [4, 5, 6, 7, 0, 1, 2] | 3      | -1
    }
}

package org.gula.myleetcode.easy

import spock.lang.Specification

class RemoveDuplicatesFromSortedArrayTest extends Specification {
    def "RemoveDuplicates"() {
        expect:
        new RemoveDuplicatesFromSortedArray().removeDuplicates(nums as int[]) == result
        where:
        nums      | result
        [1, 1, 2] | 2
    }
}

package org.gula.myleetcode.easy

import spock.lang.Specification

class ContainsDuplicateTest extends Specification {
    def "ContainsDuplicate"() {
        expect:
        new ContainsDuplicate().containsDuplicate(nums as int[]) == result
        where:
        nums                           | result
        [1, 2, 3, 1]                   | true
        [1, 2, 3, 4]                   | false
        [1, 1, 1, 3, 3, 4, 3, 2, 4, 2] | true
    }
}

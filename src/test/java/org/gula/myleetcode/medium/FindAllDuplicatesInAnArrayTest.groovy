package org.gula.myleetcode.medium

import spock.lang.Specification

class FindAllDuplicatesInAnArrayTest extends Specification {
    def "FindDuplicates"() {
        expect:
        new FindAllDuplicatesInAnArray().findDuplicates(nums as int[]) == result
        where:
        nums                     | result
        [4, 3, 2, 7, 8, 2, 3, 1] | [2, 3]
    }
}

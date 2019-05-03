package org.gula.myleetcode.easy

import spock.lang.Specification

class RemoveElementTest extends Specification {
    def "RemoveElement"() {
        expect:
        new RemoveElement().removeElement(nums as int[], val) == input
        where:
        nums                     | val | input
        [3, 2, 2, 3]             | 3   | 2
        [0, 1, 2, 2, 3, 0, 4, 2] | 2   | 5
    }
}

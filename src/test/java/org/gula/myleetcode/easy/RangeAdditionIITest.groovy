package org.gula.myleetcode.easy

import spock.lang.Specification

class RangeAdditionIITest extends Specification {
    def "MaxCount"() {
        expect:
        new RangeAdditionII().maxCount(m, n, ops as int[][]) == result
        where:
        m | n | ops              | result
        3 | 3 | [[2, 2], [3, 3]] | 4
    }
}

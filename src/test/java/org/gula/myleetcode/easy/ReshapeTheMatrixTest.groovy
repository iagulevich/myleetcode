package org.gula.myleetcode.easy

import spock.lang.Specification

class ReshapeTheMatrixTest extends Specification {
    def "MatrixReshape"() {
        expect:
        new ReshapeTheMatrix().matrixReshape(nums as int[][], r, c) == result as int[][]
        where:
        nums             | r | c | result
        [[1, 2], [3, 4]] | 1 | 4 | [[1, 2, 3, 4]]
        [[1, 2], [3, 4]] | 2 | 4 | [[1, 2], [3, 4]]
    }
}

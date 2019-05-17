package org.gula.myleetcode.medium

import spock.lang.Specification

class JumpGameTest extends Specification {
    def "CanJump"() {
        expect:
        new JumpGame().canJump2(nums as int[]) == result
        where:
        nums            | result
        []              | false
        [2, 3, 1, 1, 4] | true
        [3, 2, 1, 0, 4] | false
    }
}

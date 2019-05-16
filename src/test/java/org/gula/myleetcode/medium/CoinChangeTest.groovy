package org.gula.myleetcode.medium

import spock.lang.Specification

class CoinChangeTest extends Specification {
    def "CoinChange"() {
        expect:
        new CoinChange().coinChange(coins as int[], amount) == result
        where:
        coins               | amount | result
        [1, 2, 5]           | 11     | 3
        [186, 419, 83, 408] | 6249   | 20
    }
}

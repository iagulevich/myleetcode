package org.gula.myleetcode.easy

import spock.lang.Specification

class AddBinaryTest extends Specification {
    def "AddBinary"() {
        expect:
        new AddBinary().addBinary(a, b) == result
        where:
        a    | b   | result
        "11" | "1" | "100"
        "0"  | "0" | "0"
    }
}

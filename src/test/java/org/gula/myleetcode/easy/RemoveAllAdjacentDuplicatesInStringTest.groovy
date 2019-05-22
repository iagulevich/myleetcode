package org.gula.myleetcode.easy

import spock.lang.Specification

class RemoveAllAdjacentDuplicatesInStringTest extends Specification {

    def "RemoveDuplicates"() {
        expect:
        new RemoveAllAdjacentDuplicatesInString().removeDuplicates(str) == result
        where:
        str        | result
        "abbaca"   | "ca"
        "aaaaaaaa" | ""
        "azxxzy"   | "ay"
        "aababaab" | "ba"
    }
}

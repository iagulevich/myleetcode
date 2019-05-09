package org.gula.myleetcode.easy

import spock.lang.Specification

class ImplementStrStrTest extends Specification {
    def "StrStr"() {
        expect:
        new ImplementStrStr().strStr(haystack, needle) == result
        where:
        haystack      | needle  | result
//        "Hello"       | "ll"    | 2
//        "aaaaa"       | "bba"   | -1
        "mississippi" | "issip" | 4

    }
}
